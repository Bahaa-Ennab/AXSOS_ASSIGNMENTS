var x, y, oper;
var res = 0

function press(num) {
  var display = document.getElementById("display")
  if (display.innerText == 0) {
    display.innerText = num
  }
  else if (res==0){
    display.innerText = display.innerText + num
  }
  else{
    display.innerText = num

  }
}

function setOP(op) {

  var display = document.getElementById("display")
  x = parseFloat(display.innerText);
  console.log(x)
  display.innerText = 0
  oper = op;
  console.log(oper)
}
function clr (){
  var display = document.getElementById("display")
  display.innerText = 0
  x=0
  y=0
  oper=0

}
function calculate(){
  var display = document.getElementById("display")
  y = parseFloat(display.innerText);
  console.log(y)
  
if(oper == "*"){
  res=x*y
}else if(oper == "/"){
  res=x/y
}else if(oper == "+"){
  res=x+y
}else if(oper == "-"){
  res=x-y
}
display.innerText= res;
x=res
oper=null
}