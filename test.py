import requests
import json
from pprint import pprint


#
# HARD CODE
#
i = 1

while(i < 1000):
    r = requests.get('http://127.0.0.1:4567/api/convert/' + str(i))

    result1 = r.json()['result']

    r = requests.get('http://127.0.0.1:4567/api/convert/' + result1)

    result2 = r.json()['result']

    if(result2 == "null"):
        print("Error in " + str(i))

    i = i + 1

print('End')
