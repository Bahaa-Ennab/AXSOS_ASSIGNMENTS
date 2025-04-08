# x = [ [5,2,3], [10,8,9] ] 
# students = [
#      {'first_name':  'Michael', 'last_name' : 'Jordan'},
#      {'first_name' : 'John', 'last_name' : 'Rosales'}
# ]
# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
# }
# z = [ {'x': 10, 'y': 20} ]
# x[1][0]=[15]
# print(x) 
# students[0]["lastname"]="bryant"
# print(students[0])
# sports_directory["soccer"][0]="andres"
# print(sports_directory["soccer"])
# z[0]["y"]="30"
# print(z)
#444444444444444444444444444444444444444444444444
# def iterateDictionary():
#     students = [
#              {'first_name':  'Michael', 'last_name' : 'Jordan'},
#              {'first_name' : 'John', 'last_name' : 'Rosales'},
#              {'first_name' : 'Mark', 'last_name' : 'Guillen'},
#              {'first_name' : 'KB', 'last_name' : 'Tonel'}
#         ]
#     length= len(students)
#     print(students[0]["first_name"])
#     # for i in range(length):
#     #       print( "first name "+students[i]["first_name"],"last name "+students[i]["last_name"])
# iterateDictionary()
#66666666666666666666666666666666666666666666666666666666
# students = [
#              {'first_name':  'Michael', 'last_name' : 'Jordan'},
#              {'first_name' : 'John', 'last_name' : 'Rosales'},
#              {'first_name' : 'Mark', 'last_name' : 'Guillen'},
#              {'first_name' : 'KB', 'last_name' : 'Tonel'}
#         ]
# def iterateDictionary2(key_name, some_list):
#         for dictionary2 in some_list:
#                 if key_name in dictionary2:
#                         print(dictionary2[key_name], end=" ")
# iterateDictionary2('last_name', students)
# 88888888888888888888888888888888888888888888888888888888888


dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
def print_info(dojo):

 for i in dojo.keys():
    print(len(dojo[i]),i)
    for val in range(len(dojo[i])):
        print(dojo[i][val], end= " ")
    print("")
print_info(dojo)

