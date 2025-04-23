from django.shortcuts import render,redirect
from . import models
from django.contrib import messages
from .models import Show
# Create your views here.
def index(request):
    return redirect("/shows")

def all_shows(request):
    context={
        'shows':models.Show.get_shows_names()
    }
    return render(request,'all_shows.html',context)

def add_new_show_display(request):
    return render(request,'add_new_show.html')
def add_new_show(request):
    errors = models.Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/add_new_show_display')
    else:
        models.Show.add_new_show(request.POST)
        new_show=models.Show.last_added_show()
        
        new_show_id=new_show.id
        return redirect(f"/show_display/{new_show_id}")

def show_display(request,showid):
    context={
        'show':models.Show.show_display(showid)
    }
    return render(request,'show_details.html',context)

def show_edit_display(request,showid):
    context={
        'show':models.Show.show_display(showid)
    }
    return render(request,'edit_show_display.html',context)

def edit_show(request,showid):
    errors = models.Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect(f'/show_edit_display/{showid}')
    else:
        models.Show.edit_show(request.POST,showid)
        return redirect(f'/show_display/{showid}')

def show_delete(request,showid):
    models.Show.show_delete(showid)
    return redirect('/shows')


    

