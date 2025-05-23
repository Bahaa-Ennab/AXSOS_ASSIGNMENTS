from django.db import models
# Create your models here.
class Books(models.Model):
    title= models.CharField(max_length=255)
    desc= models.TextField()
    authors=models.ManyToManyField('Authors',related_name="books")
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Authors(models.Model):
    first_name= models.CharField(max_length=255)
    last_name= models.TextField()
    notes=models.TextField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    