import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.chrome.options import Options
from pymongo import MongoClient
from selenium.common.exceptions import NoSuchElementException

from datetime import datetime,timedelta

client = MongoClient('mongodb://localhost:27017')
db = client['MstcDataBase1']
coll = db['HALFinalG1']
des_list,sdate_list,edate_list,bid_list,pdf_list,loc_list,dep_list=[],[],[],[],[],[],[]
current_time="12-06-2023"
# Configure Chrome options to ignore SSL errors
chrome_options = Options()
chrome_options.add_argument("--ignore-ssl-errors=yes")
chrome_options.add_argument("--ignore-certificate-errors")
# Set path to chromedriver executable
webdriver_service = Service(ChromeDriverManager().install())
# Choose Chrome browser and configure options
driver = webdriver.Chrome(service=webdriver_service, options=chrome_options)

url = 'https://hal-india.co.in/TENDERS/M__63'

driver.get(url)
def page_data(tbody):

    for row in tbody.find_elements(By.TAG_NAME, 'tr')[1:]:

            cells = row.find_elements(By.TAG_NAME, 'td')
            if not cells[1].text.startswith('GEM') and 'Corrigendum' not in cells[1].text and 'Corrigendum' not in cells[2].text:

                location = cells[0].text.strip()
                bid = cells[1].text.split(' D')[0].split(' d')[0].split('Dt')[0].split('Pt')[0].split(' of')[0].removeprefix('TENDER NOTICE/').strip()
                des = cells[2].text.strip()
                dep = cells[3].text.strip()
                sdate=cells[4].text.strip()
                edate = cells[5].text.strip()
                anchor=cells[1].find_element(By.TAG_NAME,'a')
                pdf=anchor.get_attribute('href')
                pdf_list.append(pdf)

                if location or bid or des or dep or edate:

                    loc_list.append(location)
                    bid_list.append(bid)
                    des_list.append(des)
                    dep_list.append(dep)
                    try:

                        sdate_obj = datetime.strptime(sdate, "%d %B %Y")
                        sdate_iso = sdate_obj.replace(microsecond=0).isoformat()
                        sdate_list.append(sdate_iso)
                        print(sdate_iso)

                    except:

                        sdate_obj = datetime.strptime(sdate, "%d %b %Y")
                        sdate_iso = sdate_obj.replace(microsecond=0).isoformat()
                        sdate_list.append(sdate_iso)
                        print(sdate_iso)

                    try:

                        edate_obj = datetime.strptime(edate, "%d %b %Y")
                        edate_iso = edate_obj.replace(microsecond=0).isoformat()
                        edate_list.append(edate_iso)
                        print(edate_iso)
                    except:
                        edate_iso = (datetime.strptime(current_time, "%d-%m-%Y") + timedelta(days=10)).replace( microsecond=0).isoformat()
                        edate_list.append(edate_iso)
                        print(edate_iso)

                    print(location)
                    print(bid)
                    print(des)
                    print(dep)
                    print(pdf)

# Wait for the table to load
table_locator = (By.ID, 'results')
table = WebDriverWait(driver, 10).until(EC.presence_of_element_located(table_locator))

# Extract data from the table
tbody = table.find_element(By.TAG_NAME, 'tbody')
page_data(tbody)

click_last_page = driver.find_element(By.XPATH, '//*[@id="Tender1_divPageNavPosition"]/div[4]').click()
driver.implicitly_wait(10)

total_page = int(driver.find_elements(By.XPATH, '//*[@id="Tender1_divPageNavPosition"]/ul/li')[-1].text)

print(type(total_page))
driver.get(driver.current_url)

for page in range(2,total_page+1):

    click_page = driver.find_element(By.XPATH, '//*[@id="Tender1_divPageNavPosition"]/div[3]').click()
    driver.implicitly_wait(10)
    table = WebDriverWait(driver, 10).until(EC.presence_of_element_located(table_locator))
    tbody = table.find_element(By.TAG_NAME, 'tbody')
    page_data(tbody)

for bid_, des_,sdate_, edate_,loc_,dep_,pdf_ in zip(bid_list,des_list,sdate_list,edate_list,loc_list,dep_list,pdf_list):

        result = coll.find_one({"bidNo": bid_})

        if result:

            check_edatetime = coll.find_one({"edate": edate_})
            if check_edatetime != edate_:

                coll.update_one({"bidNo": bid_},
                                {"$set": {"endDate": edate_,
                                          "modifiedOn": datetime.now().replace(microsecond=0).isoformat(),
                                          "mailendDate": edate_.split('T')[0]}}, upsert=True)

        else:
            coll.update_one({"bidNo": bid_},

                            {"$set": {"scrappedOn": datetime.now().replace(microsecond=0).isoformat(),
                                      "items": des_,
                                      "updatedOnServer": False,
                                      "pdfLink": pdf_,
                                      "startDate": sdate_,
                                      "modifiedOn": datetime.now().replace(microsecond=0).isoformat(),
                                      "organizationName": "Hindustan Aeronautics Limited",
                                      "provider": "Hindustan Aeronautics Limited",
                                      "location": loc_,
                                      "deparment":dep_,
                                      "endDate": edate_,
                                      "mailendDate": edate_.split('T')[0],
                                      "mailstartDate": sdate_.split("T")[0],
                                      "category": None
                                      }
                             }, upsert=True)
