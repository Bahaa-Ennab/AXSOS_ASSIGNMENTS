function display(el) {
    alert(" loading weather report" + el.innerText)
}
function cookiek() {
    var b = document.querySelector(".cookie")
    b.remove()
}
function degree() {
    var reds = document.querySelectorAll(".num1")
    var blues = document.querySelectorAll(".num2")
    var temp = document.getElementById("temperature")
    if (temp.value == "F") {
        for (i = 0; i < reds.length; i++) {
            reds[i].innerText =Math.trunc( Math.round((reds[i].innerText * (9 / 5) + 32)))
            blues[i].innerText = Math.trunc( Math.round((blues[i].innerText * (9 / 5) + 32)))
        }
    }
    else if (temp.value == "C") {
        for (i = 0; i < reds.length; i++) {
            reds[i].innerText = Math.trunc( Math.round((reds[i].innerText - 32) * (5 / 9)))
            blues[i].innerText = Math.trunc( Math.round((blues[i].innerText - 32) * (5 / 9)))
        }
    }
}