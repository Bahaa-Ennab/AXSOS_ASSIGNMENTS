from django.db import models

# Create your models here.
class Dojo(models.Model):
    name=models.CharField(max_length=255)
    city=models.CharField(max_length=255)
    state=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    # ninjas
    
class Ninja(models.Model):
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    dojo_id = models.ForeignKey(Dojo, related_name='ninjas', on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def add_dojo(post):
    name=post['Dojo_Name']
    city=post['City_Name']
    state=post['State_Name']
    Dojo.objects.create(name=name,city=city,state=state)

def add_ninja(post):
    first_Name=post['First_Name']
    last_Name=post['Last_Name']
    dojo_id=Dojo.objects.get(id=post['Dojo_select'])
    # dojo_id=post['dojo_id']
    Ninja.objects.create(first_name=first_Name,last_name=last_Name,dojo_id=dojo_id)

def remove():
    all_dojos=Dojo.objects.all()

    all_dojos.delete()