count=1
while count<=10:
    print("hello world ")
    count+=1

x=int(input("enter a no-- "))
i=1
while i<11:
    print(f"{x}x{i}={x*i}")
    i+=1

list=[1,2,3,"hello","mahesh","ramu"]
idx=0
while idx<=len(list):
    print(list[idx])
    idx+=1



#break
i=1
while i<7:
    print(i)
    if (i==3):
        break
    i+=1

#continue









nums=(34,45,56,67,78,89,90,34)
x=34
idx=0
for val in nums:
    if(val==x):
        print(f"find the value at idx-->{idx}")
    idx+=1

#range

for i in range(0,100,2):                #(start,stop,step size)
    print(i)                            #by default start from 0 step size 1 and left the last no.

#pass statement
for i in range (5):            #didnt print anything empty 
    pass


n=int(input("enter a no-->"))
sum=0
for i in range (1,n+1):
    sum+=i
print(sum)


n=int(input("enter a no-->"))
product=1                               #important
for i in range (1,n+1):                 #agr print ko for loop k anadr likhuga to har bar print krega 
    product*=i                          #but agr bahr likhuga to sirf tbhi print krega jb for loop khtm ho jayga 
print(product)


n=int(input("enter a no-->"))
sum=0                                     #important
while i<n+1:                              #agr print ko for while k anadr likhuga to har bar print krega 
    i+=1                                  #but agr bahr likhuga to sirf tbhi print krega jb for while khtm ho jayga 
    sum+=i
print(sum)