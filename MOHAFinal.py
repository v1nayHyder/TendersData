import requests
import random
from bs4 import BeautifulSoup
from datetime import  datetime
from pymongo import MongoClient
client=MongoClient("mongodb://localhost:27017")
db=client['MstcDataBase1']
coll=db['MOHAFinalG1']

url = 'https://www.mha.gov.in/en/tenders'
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')
pages= soup.find('ul', class_='pager__items')
url_set=set()
url_list=[]
for li in pages.find_all('li'):
     for anchor in li.findAll('a'):
          pdf='https://www.mha.gov.in/en/tenders'+anchor.get('href')

          url_set.add(pdf)
des_list,sdate_list,edate_list,bid_list,pdf_list=[],[],[],[],[]
current_time="12-06-2023"
def page_data(tbody):
    for row in tbody.find_all('tr'):

         cells=row.find_all('td')
         if "Corrigendum" not in cells[2].text:

              bid=cells[1].text.removeprefix('No.').strip()
              if bid:
                bid_list.append(bid)
              else:
                  bid ="NIL"
                  bid_list.append(bid)
              des=cells[2].text.strip()

              des_list.append(des)
              anchor=cells[3].find('a')
              pdf='https://www.mha.gov.in/'+anchor.get('href')
              pdf_list.append(pdf)
              times=cells[4].find_all('time')
              sdate=times[0].text.split(',')[1].replace(' - ','::').strip()
              datetime_obj = datetime.strptime(sdate, '%m/%d/%Y::%H:%M')
              iso_sdatetime= datetime_obj.replace(microsecond=0).isoformat()
              sdate_list.append(iso_sdatetime)
              edate=times[1].text.split(',')[1].replace(' - ','::').strip()
              datetime_obj = datetime.strptime(edate, '%m/%d/%Y::%H:%M')
              iso_edatetime = datetime_obj.replace(microsecond=0).isoformat()
              edate_list.append(iso_edatetime)
              print(bid)
              print(des)
              print(pdf)
              print(iso_sdatetime)
              print(iso_edatetime)
url_list=list(url_set)
for url in url_list:
     response=requests.get(url)
     soup=BeautifulSoup(response.text,'html.parser')
     tbody=soup.find("tbody")
     page_data(tbody)

for bid_, des_, sdate_, edate_, pdf_ in zip(bid_list, des_list, sdate_list, edate_list, pdf_list):

          result = coll.find_one({"bidNo": bid_})

          if result:

               check_edatetime = coll.find_one({"endDate": edate_})
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
                                         "organizationName": "The Ministry of Home Affairs (MHA)",
                                         "provider": "The Ministry of Home Affairs (MHA)",
                                         "cityName": "Unknown City",
                                         "stateName": "Unknown City",
                                         "ministryName":"The Ministry of Home Affairs (MHA)",
                                         "endDate": edate_,
                                         "mailendDate": edate_.split('T')[0],
                                         "mailstartDate": sdate_.split("T")[0],
                                         "category": None
                                         }
                                }, upsert=True)