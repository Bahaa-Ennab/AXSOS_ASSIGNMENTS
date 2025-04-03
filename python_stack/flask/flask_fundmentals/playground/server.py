from flask import Flask , render_template
app = Flask(__name__) 
@app.route('/play')          
def Play():
    return render_template('index.html')
@app.route('/play/<x>')          
def play1(x):
    return render_template('index.html' , num_squares=int(x))
@app.route('/play/<x>/<color>')          
def color(x,color = "blue"):
    return render_template('index.html', num_squares=int(x) , squares_color=color)

if __name__=="__main__":   
    app.run(debug=True)    