from django.db import models

# Create your models here.
class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email = models.CharField(max_length=255)
    age = models.IntegerField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def adduser(post):
    firstname=post['first_name']
    lastname=post['last_name']
    email=post['email']
    age=post['age']
    User.objects.create(first_name=firstname,last_name=lastname,email=email,age=age)

def alluser():
    return User.objects.all()
