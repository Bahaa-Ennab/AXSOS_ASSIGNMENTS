from django.shortcuts import render,redirect
import random

def index(request):
    request.session['number'] = random.randint(1,100)
    return render(request, "index.html")
def usernumber(request):
    if request.method == 'POST' and request.POST['usernumber']:
        # request.session['number'] = 50
        userNum = int(request.POST['usernumber'])
        gameNum = int(request.session['number'])
        if userNum < gameNum:
            return render(request, "low.html")
        elif userNum > gameNum:
            return render(request, "high.html")
        else:
            return render(request, "won.html")
    else:
        return redirect('/')
def startnewgame(request):
    del request.session['number']
    return redirect('/')
