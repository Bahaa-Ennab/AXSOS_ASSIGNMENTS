class BankAccount:
    def __init__(self, account_name="", int_rate=0.01, balance=0):
        self.account_name=account_name
        self.int_rate=int_rate
        self.balance=balance

    def deposit(self, amount):
        self.balance+=amount
        return self

    def withdraw(self, amount):
        if self.balance> 0:
            self.balance-=amount
        else:
            self.balance-=5
            return "not enough money",self
        return self
    
    def display_account_info(self):
        if self.balance> 0:
            print(f"the {self.account_name} intrest rate is {self.int_rate} the balance is {self.balance}")
        else:
            print(f"the {self.account_name} intrest rate is {self.int_rate} the balance is {self.balance}")
            print("not enough money")
        return self

    def yield_interest(self):
        temp=self.balance
        temp*=self.int_rate
        self.balance+=temp
        return self
    
class user:
    def __init__(self,name,email,phone,balance):
        self.name=name
        self.email = email
        self.phone = phone
        self.account = BankAccount(account_name=f"{self.name}'s Account", int_rate=0.02, balance=balance)  


    def deposit(self,amount):
        self.account.deposit(amount)
        return self
    
    def make_withdraw(self,amount):
        self.account.withdraw(amount)
        return self
    
    def display(self):
        print(f"user: {self.name}")
        self.account.display_account_info()

    def transfer_money(self,other_user,amount):
        self.account.withdraw(amount)
        other_user.account.deposit(amount)
        return self

user1=user("bahaa", "b@gmail.com", "059988776655",1000 )
user2=user("ibrahim", "i.d@gmail.com", "0592997163",2000)
user1.make_withdraw(100)

user1.make_withdraw(100).transfer_money(user2,200).transfer_money(user2,200).display()
user1.transfer_money(user2,200)
user1.display()
user2.display()
