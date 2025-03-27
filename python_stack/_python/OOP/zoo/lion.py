from Animal import animal
class lion(animal) :
    def __init__(self,age,name,health,happenies,speed):
        super().__init__(age,name,health,happenies)
        self.speed=speed
    def display_info(self):
        print(f"age:{self.age},name:{self.name},health:{self.health},happenies:{self.happenies},speed:{self.speed}")