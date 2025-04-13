from django.shortcuts import render,redirect,HttpResponse

# Create your views here.
def root(request):
    return redirect('/blogs')
def index(request):
    return render(request,'blogs.html')
def new(request):
    return  render(request,'new.html')
def create(request):
    return redirect('/blogs')
def show(request, number):
    return render(request, 'show.html', {'number': number})
def edit(request, number):
    return HttpResponse(f"placeholder to edit blog {number}")
def destroy(reques,number):
    return redirect('/blogs')

