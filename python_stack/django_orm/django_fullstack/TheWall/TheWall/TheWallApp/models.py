from django.db import models
from datetime import date
import re
import bcrypt


# Create your models here.
class UserManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['first_name']) < 3:
            errors["first_name"] = "first_name should be at least 2 characters"
        if len(postData['last_name']) < 3:
            errors["last_name"] = "last_name should be at least 2 characters"
        if len(postData['password']) < 9:
            errors["password"] = "password should be at least 8 characters"
        if postData['password'] != postData['password_confirm']:
            errors["password"] = "password should be the same as the confirm password"
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(postData['email']):    # test whether a field matches the pattern            
            errors['email'] = "Invalid email address!"
        if self.model.objects.filter(email=postData['email']).exists():
            errors['email'] = "Email is already registered!"

        return errors



class User(models.Model):
    first_name= models.CharField(max_length=255)
    last_name=  models.CharField(max_length=255)
    email=  models.CharField(max_length=255)
    password=  models.CharField(max_length=255)
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = UserManager()

    def register(post):
        first_name= post['first_name']
        last_name=  post['last_name']
        email=  post['email']
        password=post ['password']
        password_hash=bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()

        User.objects.create(first_name=first_name,last_name=last_name,email=email,password=password_hash)

    def deleteuser():
       users=User.objects.all()
       users.delete()

class Messages(models.Model):
    user=models.ForeignKey(User,related_name='messages',on_delete=models.CASCADE)
    message=models.TextField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def create_meassage(request,userid):
        message=request.POST['message']
        user=User.objects.get(id=userid)
        message = Messages.objects.create(user=user,message=message)
        messageid=message.id
        request.session['messageid']=messageid
        



class Comments(models.Model):
    user=models.ForeignKey(User,related_name='comments',on_delete=models.CASCADE)
    message=models.ForeignKey(Messages,related_name='comments',on_delete=models.CASCADE)
    comment=models.TextField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def make_comment(request,messageid):
        message=Messages.objects.get(id=messageid)
        user_id=request.session['userid']
        user=User.objects.get(id=user_id)
        comment=request.POST['comment']
        
        Comments.objects.create(user=user,comment=comment,message=message)
