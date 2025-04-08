
# Create your views here.
from django.shortcuts import render
def index(request):
    return render(request,"index.html" )
def result(request):
    if 'costume' not in request.POST:
        costume= False
    else:
        costume= True

    if 'salary' not in request.POST:
        salary= False
    else:
        salary= True
    context={"username" :  request.POST['username'],
             "location":request.POST['location'],
             "language":request.POST['language'],
             "comment":request.POST['comment'],
             "fun":request.POST['fun'],
             "costume":costume,
             "salary":salary,
             
             }
    return render(request,"result.html" ,context )