var button=document.querySelector("button")
function replaceColor(){
    button.style.backgroundColor="#ffffff"
    button.style.color="#e0554b"
}
var button=document.querySelector("button")
function returnColor(){
    button.style.backgroundColor="#e0554b"
    button.style.color="#ffffff"
}
function alertBox(){
    alert(document.querySelector("input").value)
}

function playMusic(){
    var play = document.querySelector("audio")
    play.play()
}