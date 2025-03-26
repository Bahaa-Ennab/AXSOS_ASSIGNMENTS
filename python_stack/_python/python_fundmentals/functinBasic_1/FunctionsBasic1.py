#1
# def a():
#     return 5  #5
# print(a())
#2
# def a(): #10
#     return 5
# print(a()+a())
#3
# def a(): 
# #5
#     return 5
#     return 10
# print(a())
# #6
# def a(b,c): #3,5
#     print(b+c)
# print(a(1,2) + a(2,3))
#7
# def a(b,c): #2,5
#     return str(b)+str(c)
# print(a(2,5))
#8
# def a():
#     b = 100 #100,10
#     print(b)
#     if b < 10:
#         return 5
#     else:
#         return 10
#     return 7
# print(a())
# #9
# def a(b,c): #7,14,21
#     if b<c:
#         return 7
#     else:
#         return 14
#     return 3
# print(a(2,3))
# print(a(5,3))
# print(a(2,3) + a(5,3))
# #10
# def a(b,c): #8
#     return b+c
#     return 10
# print(a(3,5))
#11
# b = 500 #500 ,300,500,300,500
# print(b)
# def a():
#     b = 300
#     print(b)
# print(b)
# a()
# print(b)
#12
# b = 500
# print(b) #500 500 300 500
# def a():
#     b = 300
#     print(b)
#     return b
# print(b)
# a()
# print(b)
#13
b = 500 #500 500 300 300
print(b)
def a():
    b = 300
    print(b)
    return b
print(b)
b=a()
print(b)
#14
# def a():
#     print(1)
#     b()
#     print(2)
# def b():
#     print(3)
# a()
#15
# def a():
#     print(1)
#     x = b()
#     print(x)
#     return 10
# def b():
#     print(3)
#     return 5
# y = a()
# print(y)
#5
# def a():
#     print(5)
# x = a()
# print(x)