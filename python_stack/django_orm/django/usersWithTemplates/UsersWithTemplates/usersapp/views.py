from django.shortcuts import render,redirect
from . import models
# Create your views here.
def index(request):
    context={
        'users':models.alluser()
    }
    return render(request,"index.html",context)

def user_post(request):
    if request.method == 'POST':
        models.adduser(request.POST)
        return redirect('/')