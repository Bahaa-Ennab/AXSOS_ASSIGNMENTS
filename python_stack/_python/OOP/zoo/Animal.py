class animal:
    def __init__(self,age,name,health,happenies):
        self.age=age
        self.name=name
        self.health=health
        self.happenies=happenies
    def display_info(self):
        print(f"age:{self.age},name:{self.name},health:{self.health},happenies:{self.happenies}")
    def feed(self):
        self.happenies=self.happenies+10
        self.health=self.health+10
        print(self.happenies,self.health)