from django.shortcuts import render,redirect
from . import models

# Create your views here.
def index(request):
    context={
        'dojos':models.Dojo.objects.all(),
        'ninjas':models.Ninja.objects.all(),
             
             }
    return render(request, 'index.html',context)

def add_dojo(request):
    if request.method == 'POST':
        models.add_dojo(request.POST)
        return redirect('/')
    else:
        return redirect('/')
    
def add_ninja(request):
    if request.method == 'POST':
        models.add_ninja(request.POST)
        return redirect('/')
    else:
        return redirect('/')
def remove(request):
    if request.method == 'POST':
        models.remove()
        return redirect('/')



