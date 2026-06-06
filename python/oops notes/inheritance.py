class employee:
    a=1
class coder(employee):
    b=2
    def __init__(self):
        print("good")
class programmer(coder):
    def __init__(self):
        super().__init__()
        print("bad")
    c=3

instance=programmer()