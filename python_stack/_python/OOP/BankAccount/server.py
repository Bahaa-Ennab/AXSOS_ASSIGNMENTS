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
        

account1=BankAccount("account1",0.20,100)
account2=BankAccount("account2",0.25,200)
account1.deposit(25).deposit(25).deposit(50).withdraw(10).yield_interest().display_account_info()
account2.deposit(25).deposit(25).withdraw(10).withdraw(10).withdraw(10).withdraw(10).withdraw(10).yield_interest().display_account_info()