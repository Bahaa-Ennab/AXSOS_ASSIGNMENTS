from django.db import models
# Create your models here.
class Books(models.Model):
    title= models.CharField(max_length=255)
    description= models.TextField()
    authors=models.ManyToManyField('Authors',related_name="books")
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def add_book(post):
        title = post['title']
        description = post['description']
        Books.objects.create(title=title,description=description)
    
    def delete_book():
        book_del= Books.objects.all()
        book_del.delete()

    def makeconnection(post,bookid):
        book1=Books.objects.get(id=bookid)
        author1=Authors.objects.get(id=post['select_author'])
        book1.authors.add(author1)
    
    def display_books():
        return Books.objects.all()

class Authors(models.Model):
    first_name= models.CharField(max_length=255)
    last_name= models.TextField()
    notes=models.TextField()
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def add_author(post):
        first_name= post['first_name']
        last_name= post['last_name']
        notes= post['notes']
        Authors.objects.create(first_name=first_name,last_name=last_name,notes=notes)

    def display_authors():
        return Authors.objects.all()
    
    def makeconnection(post,authorid):
        book1=Books.objects.get(id=post['select_book'])
        author1=Authors.objects.get(id=authorid)
        book1.authors.add(author1)

    