from Animal import animal
class monkey(animal) :
    def __init__(self,age,name,health,happenies,banans):
        super().__init__(age,name,health,happenies)
        self.banans=banans
    def display_info(self):
        print(f"age:{self.age},name:{self.name},health:{self.health},happenies:{self.happenies},he has {self.banans} bananas")