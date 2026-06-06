def cal(a,b):                   #method 1 
    sum=a+b                     #function ko call kruga tbhi def chlega 
    print(sum)
    return sum
cal(5,2)


def cal_sum(a,b):              # method 2 
    return a+b
sum=cal_sum(1,2)
print(sum)

#average of 3 n0.

def av(a,b,c):
    return (a+b+c)/3
fxn=av(1,2,3)
print(fxn)


def fxn(a,b):
    print (a+b)                # if i use return instead of print then it doesnt return none 
g=fxn(2,3)
print(g)

def fxn (a,b):
    print(a+b)
    return "ok"
g=fxn(3,4)
print(g)    

#recursion [call itself ]
# forlmula 
# factorial(n)=n x factorial(n-1)

def factorial(n):
    if(n==1 or n==0):
        return 1 
    return n * factorial (n-1)
n=int(input("enter a no-->"))
print(f"the factorial of this no :{factorial(n)}") 