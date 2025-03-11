console.log("page loaded...");
function editProf() {
    var x = document.getElementById("name")
    x.innerText = "Bahaa ennab"
}
function declineReq(num) {
    var request = document.getElementById("req" + num)
    request.remove()
    var numbadge = document.querySelector(".badge")
    numbadge.innerText--;
}
function acceptReq(num) {
    var request = document.getElementById("req" + num)
    request.remove()
    var numbadge = document.querySelector(".badge")
    numbadge.innerText--;
    var friends = document.getElementById("connum")
    friends.innerText++
}
