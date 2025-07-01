<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style2.css">

<title>Welcome!</title>
</head>
<body>
	<div class="links">
		<h1>
			Welcome,
			<c:out value="${user.firstName}"></c:out>
		</h1>
		<a href="/logout">Log out</a>
	</div>

	<hr />
	<div class="links">
		<h1>TalkTracker Dashboard</h1>
	</div>

	<div class="table-container">
		<h1>${talk.title}by${talk.user.firstName}</h1>
		<h2>this talk will be on ${talk.talkDate}</h2>
		<p>${talk.talkDetails}</p>

		<a href="/home"><button>home</button></a>
	</div>
	<c:if test="${talk.user.id == user.id}">
		<div>
			<a href="/update/${talk.id}"><button>Edit the Talk</button></a>
			<form action="/delete/${talk.id}" method="post">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete">
			</form>
		</div>
	</c:if>
</body>
</html>