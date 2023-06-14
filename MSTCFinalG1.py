from selenium import webdriver
from datetime import datetime
import requests
from bs4 import BeautifulSoup
from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017")
db = client['MstcDataBase1']
coll1 = db['MstcFinalG1']
url = "https://www.mstcindia.co.in/content/Forthcoming_e_Auctions_For_All_regions.aspx"
driver = webdriver.Chrome()
driver.get(url)
url_list = []
website_url = driver.page_source
soup = BeautifulSoup(website_url, 'html.parser')
tables = soup.find_all("table", class_="table")
#creating an empty list to store auction bid numbers
Bid_list = []
for table in tables:

    pdf = table.findAll('a')
    for pd in pdf:

        span_text = (pd.find("span").text.split('/'))
        #getting the last element of the span_text list, which represents the auction bid number
        val1 = span_text[len(span_text) - 1]
        Bid_list.append(val1)
        # getting the value of the href attribute of the current link, and appending it to the base URL to create the complete auction URL
        val2 = "https://www.mstcindia.co.in/" + pd.get('href')
        url_list.append(val2)
# iterating over each auction URL and bid number in parallel
for url, bid_number in zip(url_list, Bid_list):

    link = url
    #creating an empty list to store the auction start and end times
    date_time_list = []
    Access = requests.get(url)
    soup = BeautifulSoup(Access.text, 'html.parser')
    form = soup.find("form", method="post")
    Auction = form.find("span", id="ContentPlaceHolder1_lblAuctionNo").text
    sDate = form.find("span", id="ContentPlaceHolder1_lblOpeningDateTime").text
    eDate = form.find("span", id="ContentPlaceHolder1_lblCloseAt").text.lstrip()
    date_format = "%d-%m-%Y::%H:%M:%S"
    date_time_list.append([sDate, eDate])

    for list in date_time_list:

        sDate, eDate = list[0], list[1]
        sdate_object = datetime.strptime(sDate, date_format)
        edate_object = datetime.strptime(eDate, date_format)
        sDate = sdate_object.replace(microsecond=0).isoformat()
        eDate = edate_object.replace(microsecond=0).isoformat()

    location = form.find('span', id="ContentPlaceHolder1_lblLocation").text.lstrip()

    try:
        Description = form.find("span", id="ContentPlaceHolder1_dgLot_lblName_0").text
        if Description.isnumeric():
            val3 = form.find("span", id="ContentPlaceHolder1_dgLot_lblLotDesc_0")
            Description = val3.find("b").text.split(":")[0]
    except:
        Description = "Description is not mentioned " + Auction

    def check_eDate_time(eDate_time):

         if eDate_time!=eDate:

             coll1.update_one({"bidNo":bid_number},
                              {"$set":{ "modifiedOn":datetime.now().replace(microsecond=0).isoformat(),
                              "endDate":eDate,
                              "mailendDate": eDate.split('T')[0]
              }},upsert=True)
    def update_tender_data():

        coll1.update_one({"bidNo": bid_number}, {
        "$set": {"scrappedOn": datetime.now().replace(microsecond=0).isoformat(),
                 "modifiedOn":datetime.now().replace(microsecond=0).isoformat(),
                 "endDate": eDate,
                 "startDate": sDate,
                 "description": Description,
                 "organizationName": "Ministry of Steel,Government of India",
                 "provider": "Ministry of Steel, Government of India",
                 "pdfLink": link,
                 "mailendDate": eDate.split('T')[0],
                 "mailstartDate": sDate.split("T")[0],
                 "location": location,
                 "category": None,
                 "updatedOnServer": False}}, upsert=True)

    result=coll1.find_one({"bidNo":bid_number})
    if result:

         eDate_time=result.get("endDate")
         check_eDate_time(eDate_time)
    else:

        update_tender_data()

