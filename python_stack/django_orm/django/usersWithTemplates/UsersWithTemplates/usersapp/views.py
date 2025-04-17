from django.shortcuts import render,redirect
from . import models
# Create your views here.
def index(request):
    context={
        'users':models.alluser()
    }
    return render(request,"index.html",context)

#this method will receive http post rquest from the form
def user_post(request): #should start with verp
    if request.method == 'POST':
        models.adduser(request.POST)
        return redirect('/')
    else:
        return redirect('/')

    #should add else to see if not post