import unittest
class MathDojo:
    def __init__(self):
        self.result=0
    def add(self,num,*nums):
        self.result=self.result+num+sum(nums)
        return self.result
    def subtract(self,num,*nums):
        self.result=self.result-num-sum(nums)
        return self.result
temp=MathDojo()
# print(temp.add(2,2,2))
class equSumTests(unittest.TestCase):
    def testOne(self):
        self.assertEqual(temp.add(2,2,2),6)

if __name__ == '__main__':
    unittest.main()