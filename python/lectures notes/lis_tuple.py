list=["ram","ravan","delhi","shimla",'shaktiman'] #specially in list and set the method is written outside the print
print(type(list))
print(len(list))
print(list[2])
print(list[0:5])     #same a string 
print(list[-5:-1])

#methods  [remember list are mutable]

list.append("arjun")
print(list)
list.sort()        # sort only int or string 
print(list)
list.sort(reverse=True)     #first it sort the list then reverse 
print(list)
list.reverse()
print(list)          #it reverse the list 
list.pop(1)         #delete the index 1st element 
print(list)
print(list.pop(1))   #print the popped word 
list.instert[0,5]
print(list)       #at 0th index place a value 5 
# list=[1,2,3,4]
# list[0]=9
# print(list)               #so list is mutable 







#tuple     [immutable]

# tup=(1)     #type integer
# tup=(1,)       #single elment tuple
tup=("pawan","hari","meghshyam","raju")
print(len(tup))
print(type(tup))
print(tup[0:3])     #slicing

#method

print(tup.index("pawan"))
print(tup.count("a"))
