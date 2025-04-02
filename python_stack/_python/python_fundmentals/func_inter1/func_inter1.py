import random
def randInt(min=0, max=100):
    if min > max:
        return False
    num = random.randint(min,max)
    return round(num)
print(randInt())
print(randInt(max=50))
