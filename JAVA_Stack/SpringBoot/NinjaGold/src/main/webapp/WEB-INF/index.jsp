<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Ninja Gold Game</title>
</head>

<body>
    <main>
        <p class="header">
            This is a game of strategy and luck <br>
            you have to get your score to 200 to win <br>
            or else...
        </p>
        <div class="score">
            <form action="total" method="POST">
                <label for="total">Your Gold:
                    <input type="text" name="score" value="<c:out value="${result}"/>">
                </label>
            </form>
        </div>
        <section>
            <form action="/counter" method="POST" class="work-options">
                <div>
                    <h2>Farm</h2>
                    <p class="description">(earns 10-20 gold)</p>
                    <input type="submit" name="farm" value="Find Gold!" class="button">
                </div>
            </form>
            <form action="/counter" method="POST" class="work-options">
                <div>
                    <h2>Cave</h2>
                    <p class="description">(earns 5-10 gold)</p>
                    <input type="submit" name="cave" value="Find Gold!" class="button">
                </div>
            </form>
            <form action="/counter" method="POST" class="work-options">
                <div>
                    <h2>House</h2>
                    <p class="description">(earns 2-5 gold)</p>
                    <input type="submit" name="house" value="Find Gold!" class="button">
                </div>
            </form>
            <form action="/counter" method="POST" class="work-options">
                <div>
                    <h2>Quest</h2>
                    <p class="description">(earns/takes 0-50 gold)</p>
                    <input type="submit" name="quest" value="Find Gold!" class="button">
                </div>
            </form>
            <label for="activites" class="score">Activities: </label>
        <article class="result">
<c:forEach var="entry" items="${log}" varStatus="status">
    <p style="color: ${entry.color};">${entry.message}</p>
</c:forEach>
                    
        </article>
        </section>
    </main>
</body>
</html>