from django.shortcuts import render,redirect
import random
from datetime import datetime
# Create your views here.
list1=[]
def index(request):
    if "score" not in request.session:
        request.session["score"]=0
    if "acitvities" not in request.session:
        request.session["acitvities"]=[]
    return render(request, "index.html" )
    

def farm(request):
    time = datetime.now().strftime('%Y-%m-%d %H:%M:%p')
    temp=random.randint(10,20)
    request.session["score"]+=temp
    if request.session["score"] >= 200:
        return render(request, "win.html" )
    else:
        request.session["acitvities"].append({"acitvity":f"you enterd a farm and earned {temp} gold. at {time}" , "color":"green"})
    return redirect("/")

def cave(request):
    time = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    temp=random.randint(10,20)
    request.session["score"]+=temp
    if request.session["score"] >= 200:
            return render(request, "win.html" )
    else:
        request.session["acitvities"].append({"acitvity":f"you enterd a cave and earned {temp} gold. at {time}" , "color":"green"})
    return redirect("/")

def house(request):
    time = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    temp=random.randint(10,20)
    request.session["score"]+=temp
    if request.session["score"] >= 200:
            return render(request, "win.html" )
    else:
        request.session["acitvities"].append({"acitvity":f"you enterd a house and earned {temp} gold. at {time}" , "color":"green"})
    return redirect("/")

def earnorlose(request):
    time = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    temp = random.randint(-50,50)
    request.session["score"] += temp
    if request.session["score"] < 0:
        return render(request, "lose.html" )
    elif request.session["score"] >= 200:
        return render(request, "win.html" )
    else:
        if temp > 0:
            request.session["acitvities"].append({"acitvity":f"you enterd a quest and earned {temp} gold. at {time}" , "color":"green"})
        else:
            request.session["acitvities"].append({"acitvity":f"you enterd a quest and <strong>lose</strong> {temp} gold. at {time}" , "color":"red"})
    return redirect("/")

def reset(request):
    del request.session["acitvities"]
    del request.session["score"]
    return redirect("/")
