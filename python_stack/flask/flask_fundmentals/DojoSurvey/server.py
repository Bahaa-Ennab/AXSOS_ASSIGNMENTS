from flask import Flask , render_template,request
app = Flask(__name__) 
@app.route('/')          
def main():
    return render_template("index.html")

@app.route('/result',methods=["POST"])
def result():
    print(request.form)
    if "costume" not in request.form:
        costume= False
    else:
        costume= True

    if "salary" not in request.form:
        salary= False
    else:
        salary= True
        
    username=request.form["username"]
    location=request.form["location"]
    language=request.form["language"]
    comment=request.form["comment"]
    fun=request.form["fun"]
       

    return render_template("result.html",user=username,location=location,language=language,comment=comment,fun=fun,costume=costume,salary=salary)

if __name__=="__main__":   
    app.run(debug=True)    