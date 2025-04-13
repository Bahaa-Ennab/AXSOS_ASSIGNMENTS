from flask import Flask, render_template, request, redirect,session
app = Flask(__name__)  
app.secret_key = 'keep it secret, keep it safe'

@app.route('/')         
def count():
    if 'count' not in session:
        session['count'] = 0
        print('key exists!')
    else:
        session['count']+=1
    return render_template("index.html")

@app.route('/destroy_session')         
def destroy_session():
    session.clear()
    return redirect('/')

@app.route('/plus_2')         
def plus_2():
    if 'count' not in session:
        session['count'] = 1
        print('key exists!')
    else:
        session['count']+=1
    return redirect('/')

if __name__=="__main__":   
    app.run(debug=True)    