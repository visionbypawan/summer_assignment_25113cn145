# perfect guess
import random
n=random.randint(1,100)
a=-1
guess=1
while a!=n :
    a=int(input("guess a number:"))
    if (n>a) :
        print("guess higher number")
        guess+=1
    elif (a>n):
        print("guess lower number")
        guess+=1

print(f"you guess the number {n} in {guess}attempts")




