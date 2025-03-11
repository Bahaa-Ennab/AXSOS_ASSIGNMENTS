function increaselikes() {
    var likeCount = document.getElementById("like-count");
    var currentLikes = parseInt(likeCount.innerText);
    likeCount.innerText = currentLikes + 1;
}