str="i am good boy \nmy name is pawan"                   
print(str)
print(len(str))
print(type(str))
print(str[2])     #indexing start from 0
print(str[0:5])   #slicing it left the last idex 
print(str[-3:-1])    #negative indexing left the -1 index 
print(str[1:6:2])    #print with the gap of 2 

# methods 

print(str.endswith("an"))    #answer in true or false 
print(str.capitalize())      #capitalize the first letter of sentence 
print(str.replace("am","is"))  #replace 
print(str.find("a"))           #print the index of 1st occurance of letter or word if the letter or word not occur print -1
print(str.count("o"))          #it count 

# special tricks 

intro="pawan is good \"boy\""     #\"\"   
name =input("enter your name ")
print(f"good morning {name}")     # called f string most important 

print("pawan",end="")              #here end is a fxn print pawan chauhan
print("chauhan")
