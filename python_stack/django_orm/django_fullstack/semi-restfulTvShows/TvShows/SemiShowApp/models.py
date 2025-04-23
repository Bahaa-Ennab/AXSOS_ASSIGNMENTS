from django.db import models
from datetime import date

# Create your models here.
class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['title']) < 3:
            errors["title"] = "title should be at least 2 characters"
        if len(postData['network']) < 3:
            errors["network"] = "network should be at least 3 characters"
        if len(postData['description']) < 11:
            errors["description"] = "description should be at least 10 characters"
        if postData['release_date']:
            try:
                release_date = date.fromisoformat(postData['release_date'])
                if release_date >= date.today():
                    errors["release_date"] = "Release date must be in the past"
            except ValueError:
                errors["release_date"] = "Invalid date format"

        return errors


class Show(models.Model):
    title= models.CharField(max_length=255)
    network=  models.CharField(max_length=255)
    release_date=models.DateField()
    description= models.TextField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects= ShowManager() 

    def add_new_show(post):
        title= post['title']
        network=post['network']
        release_date=post['release_date']
        description=post['description']
        
        Show.objects.create(title=title,network=network,release_date=release_date,description=description)

    def get_shows_names():
        return Show.objects.all()
    
    def show_display(showid):
        return Show.objects.get(id=showid)
    
    def last_added_show():
        return Show.objects.latest('id')
    
    def edit_show(post,showid):
        show=Show.objects.get(id=showid)
        show.title= post['title']
        show.network=post['network']
        show.release_date=post['release_date']
        show.description=post['description']
        show.save()
        return show
    def show_delete(showid):
        show=Show.objects.get(id=showid)
        show.delete()



       

        