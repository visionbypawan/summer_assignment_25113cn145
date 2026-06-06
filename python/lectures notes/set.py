collection={1,2,3,'hello',"hari ",1}            #sets doesnt print a single value twice. 
print(len(collection),type(collection))         #set are mutable 
                                                  #collection of unordered item bywhich index doesnt matter

collection={}                                     #empty dictiionary 
collection=set()                                  #empty set 
print(type(collection))


#methods 
collection={1,2,3,'hello',"hari ",1}
collection.add( 5)
collection.remove(2)
collection.pop()                                     #randomly delete a element 
collection.clear()                                   #delete all element 
print(collection)


set1={1,2,3,4,5}
set2={4,5,6,7,8}
print(set1.union(set2))
print(set1.intersection(set2 ))