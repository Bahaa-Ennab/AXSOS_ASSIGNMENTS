from flask import Flask 
app = Flask(__name__)   
@app.route('/')          
def hello_world():
    return 'Hello World!'
@app.route('/champion')          
def champion():
    return 'Champion!'
@app.route('/say/<name>')
def say(name):
    return "hi " + name
@app.route('/repeat/<int:num>/<name>')
def repeat(num,name):
    result = (name + " ") * num
    return result+ " "
if __name__=="__main__":   
    app.run(debug=True)    