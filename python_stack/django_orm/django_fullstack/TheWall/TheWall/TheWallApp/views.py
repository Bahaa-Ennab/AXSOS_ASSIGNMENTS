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
            return redirect('/')
    else:
        context={
            'register':f'Registration failed'
        }
        return render(request,'index.html',context)
    
def login(request):
    email = models.User.objects.filter(email=request.POST['email'])
    if email:
        logged_user=email[0]
        if bcrypt.checkpw(request.POST['password'].encode(), logged_user.password.encode()):
            request.session['userid'] = logged_user.id
            return redirect('/codingdojowall')
        return redirect("/")
    
def codingdojowall(request):
        if 'userid' in request.session:
            user_id=request.session['userid']
            context={
                'user':models.User.objects.get(id=user_id),
                'messages': models.Messages.objects.all().order_by('-updated_at'),
            }
            return render(request,'codingdojowall.html',context)
        else:
            return redirect("/")
        
def log_out(request):
    del request.session['userid']
    return redirect("/")


def deleteuser(request):
    models.User.deleteuser()
    return redirect('/')

def post_message(request,userid):
    models.Messages.create_meassage(request,userid)
    return redirect('/codingdojowall')

def make_comment(request,messageid):
    models.Comments.make_comment(request,messageid)
    return redirect('/codingdojowall')


def delete_messages(request):
    messages= models.Messages.objects.all()
    messages.delete()
    return redirect('/codingdojowall')

    



