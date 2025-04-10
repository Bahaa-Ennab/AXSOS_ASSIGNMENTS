from django.shortcuts import render,redirect
def index(request):
    if 'number' not in request.session:
        request.session['number'] = 50
    return render(request, "index.html")
def usernumber(request):
    userNum = int(request.POST['usernumber'])
    gameNum = int(request.session['number'])
    if userNum < gameNum:
        return render(request, "low.html")
    elif userNum > gameNum:
        return render(request, "high.html")
    else:
        return render(request, "won.html")

