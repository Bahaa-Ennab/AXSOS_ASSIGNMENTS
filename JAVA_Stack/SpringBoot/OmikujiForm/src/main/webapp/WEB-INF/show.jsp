<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Show an Omikuji!</title>
</head>

<body>
	<header>
		<h1>Here's Your Omikuji!</h1>
	</header>

	<main>
		<div>
			<p>
				In
				<c:out value="${number}" />
				years, you will live in
				<c:out value="${city}" />
				with
				<c:out value="${person}" />
				as your roommate,
				<c:out value="${hobby}" />
				the next time you see a
				<c:out value="${animal}" />
				you will have a good luck. also,
				<c:out value="${compliment}" />
			</p>
		</div>
		<a href="http://127.0.0.1:8080/omikuji">Go Back</a>
	</main>
</body>

</html>