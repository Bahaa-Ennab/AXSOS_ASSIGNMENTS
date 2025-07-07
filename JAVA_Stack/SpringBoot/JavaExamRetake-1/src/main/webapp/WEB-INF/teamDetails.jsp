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

	<hr />
	<div class="links">
		<h1>${team.teamName}</h1>
		<a href="/home">dashboard</a>

	</div>

	<div class="table-container">
		<p>Team Name: ${team.teamName}</p>
		<p>Added By:${team.user.userName}</p>
		<p>skill level:${team.skillLvl}</p>
		<p>game day:${team.gameDay}</p>

	</div>
	<c:if test="${team.user.id == user.id}">
		<div>
			<a href="/team/edit/${team.id}"><button>Edit the Team</button></a>
			<form action="/delete/${team.id}" method="post">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete">
			</form>
		</div>
	</c:if>
</body>
</html>