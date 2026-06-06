info={
    "name":"pawan",
    "age":18,
    "subject":["physics=34","chemistry=45","maths=98"],   #can store data in dic in the form of tuple and list 
    "topics":("dict","set"),
    "subject":{
        "phy":98,                                                   #called nested dictionary 
        "chem":98,
        "maths":98
    }
}
    
info["name"]="chauhan"
print(info["name"])                     #important---- in dictionary we dont talk about index only talk about key.
info["surname"]="thakur"
print(info)
print(info["subject"])
print(info["subject"]["chem"])

#methods

print(info.keys())
print(info.values())
print(info.items())
print(info.get("name"))

print(info['name'])
print(info.get("name"))     # both have same answer BUT

# print(info['name2'])       #error 
print(info.get("name2"))     #none 