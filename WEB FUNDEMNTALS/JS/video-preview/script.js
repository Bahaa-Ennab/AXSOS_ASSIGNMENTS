console.log("page loaded...");
var x= document.getElementById("myvideo")
x.muted=true
function playVid(){
 x.play()
}
function pauseVid() {
    x.pause();
    x.currentTime = 0
}

