class student:
    schoolname="IIT"                    #class attribute which is fix for all
    standard="12th"
    def greet(self,name1,name2,name3):
        print(f"there are some student having rank greater than 3 are excellent student{name1,name2,name3} ")
    def __init__(self,name,rank):       #instance attribute different for all or may be not 
        self.name=name
        self.rank=rank                  # init fxn call automatically but must to call other fxn like greet
        if (rank<=3):                   #important to pss a self parameter
            print("excellent")
            if (rank==1):               #object attribute > class attribute
                print("congrats you got the 1st prize ")
        elif (rank>3 or rank<=7):
            print("good")
        elif (rank>7):
            print("try to work hard ")
friend=student("raj",1)
print(friend.name,friend.standard,friend.rank)

friend=student("shivam",2)
print(friend.name,friend.standard,friend.rank)

friend=student("mukul",3)
print(friend.name,friend.standard,friend.rank)

friend=student("kuldeep",4)
print(friend.name,friend.standard,friend.rank)

friend=student("pankaj",5)
print(friend.name,friend.standard,friend.rank)

friend=student("radhe",6)
print(friend.name,friend.standard,friend.rank)

friend=student("ram",7)
print(friend.name,friend.standard,friend.rank)

friend=student("kishan",8)
print(friend.name,friend.standard,friend.rank)

friend=student("suraj",9)
print(friend.name,friend.standard,friend.rank)

friend=student("prateek",10)
print(friend.name,friend.standard,friend.rank)

friend=student("lokesh",11)
print(friend.name,friend.standard,friend.rank)

friend=student("raju",12)
print(friend.name,friend.standard,friend.rank)
print(f"school name is {friend.schoolname}")
friend.greet("raj","shivam","mukul")

  