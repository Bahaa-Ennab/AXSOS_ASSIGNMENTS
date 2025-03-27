from Animal import animal
class dog(animal) :
    def __init__(self,age,name,health,happenies,smell):
        super().__init__(age,name,health,happenies)
        self.smell=smell
    def display_info(self):
        print(f"age:{self.age},name:{self.name},health:{self.health},happenies:{self.happenies},smell:{self.smell}")