from django.shortcuts import render,redirect
from . import models
from django.contrib import messages
import bcrypt

# Create your views here.
def index(request):
    return render(request,'index.html')


def register(request):
    if request.method == 'POST':
        errors = models.User.objects.basic_validator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/')
        else:
            models.User.register(request.POST)
        email = models.User.objects.filter(email=request.POST['email'])
        if email:
            logged_user=email[0]
            request.session['userid'] = logged_user.id
            return redirect('/favorite_books')        
    return render(request,'index.html')
    
    
def login(request):
    email = models.User.objects.filter(email=request.POST['email'])
    if email:
        logged_user=email[0]
        if bcrypt.checkpw(request.POST['password'].encode(), logged_user.password.encode()):
            request.session['userid'] = logged_user.id
            return redirect('/favorite_books')
        return redirect("/")
    
def log_out(request):
    del request.session['userid']
    return redirect("/")

    
def favorite_books(request):
    if request.session['userid']:
        user_id=request.session['userid']
        context={
            'user':models.User.get_user(user_id)
        }
        return render(request,'favorite_books.html',context)
    else:
        return redirect("/")

    
