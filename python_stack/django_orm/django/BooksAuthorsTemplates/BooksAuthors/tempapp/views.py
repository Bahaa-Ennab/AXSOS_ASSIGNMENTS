from django.shortcuts import render,redirect
from . import models

# Create your views here.
def index(request):
    context={
        'Books':models.Books.objects.all(),
    }
    return render(request,'index.html', context)

def add_book(request):
    if request.method == 'POST':
        models.Books.add_book(request.POST)
        return redirect("/")
    else:
        return redirect("/")
    
def delete_book(request):
    if request.method == 'POST':
        models.Books.delete_book()
        return redirect("/")
    else:
        return redirect("/")
def add_author(request):
    if request.method == 'POST':
        models.Authors.add_author(request.POST)
        return redirect("/autour_index")
    else:
        return redirect("/autour_index")

def author_index(request):
    context={
        'authors':models.Authors.display_authors()
    }

    return render(request,'author.html',context)

def display_book_details(request,bookid):
    context={
        'books':models.Books.objects.get(id=bookid),
        'authors':models.Authors.display_authors()
    }
    return render(request,'books_details.html',context)

def add_author_to_book(request,bookid):
    if request.method == 'POST':
        models.Books.makeconnection(request.POST,bookid)
        return redirect(f'/display_book_details/{bookid}')    
    else:
        return redirect(f'/display_book_details/{bookid}')
    
def display_author_details(request,authorid):
    context={
        'authors':models.Authors.objects.get(id=authorid),
        'Books':models.Books.objects.all(),

    }
    return render(request,'authors_details.html', context)

def add_book_to_author(request,authorid):
    if request.method == 'POST':
        models.Authors.makeconnection(request.POST,authorid)
        return redirect(f'/display_author_details/{authorid}')    
    else:
        return redirect(f'/display_author_details/{authorid}')
    



