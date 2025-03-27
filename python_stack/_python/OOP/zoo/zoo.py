from lion import lion
from monkey import monkey
from dog import dog
class zoo:
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
    def add_lion(self,age, name,health,happenies,speed):
        self.animals.append( lion(age,name,health,happenies,speed) )
    def add_monkey(self,age, name,health,happenies,banana):
        self.animals.append( monkey(age,name,health,happenies,banana) )
    def add_dog(self,age, name,health,happenies,smell):
        self.animals.append( dog(age,name,health,happenies,smell) )
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)
        for animal in self.animals:
            animal.display_info()

zoo1= zoo("basheer's zoo")
zoo1.add_dog(10,"nila",20,30,40)
zoo1.add_monkey(5,"lily",90,70,4)
zoo1.add_lion(7,"simba",89,90,90)
zoo1.print_all_info()