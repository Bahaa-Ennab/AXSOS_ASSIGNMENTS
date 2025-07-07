<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Welcome!</title>
</head>
<body>
	<hr />
	<div class="table-container">
		<h1 class="title">edit team</h1>
		<a href="/home">Dashboard</a>
		<form:form action="/update-team/${editTeam.id}" method="post"
			modelAttribute="editTeam">
			<input type="hidden" name="_method" value="put">
			<form:input path="user" type="hidden" value="${user.id}" />

			<table border="1">
				<tbody>
					<tr>
						<td><form:label path="teamName">
								<h2>Team Name :</h2>
							</form:label></td>
						<td><form:input path="teamName" /> <form:errors
								path="teamName" cssClass="error" /></td>
					</tr>
					<tr>
						<td><form:label path="skillLvl">
								<h2>Skill Level :</h2>
							</form:label></td>
						<td><form:input path="skillLvl" type="number" /> <form:errors
								path="skillLvl" cssClass="error" /></td>
					</tr>
					<tr>
						<td><form:label path="gameDay">
								<h2>Game Day :</h2>
							</form:label></td>
						<td><form:input path="gameDay" /> <form:errors
								path="gameDay" cssClass="error" /></td>
					</tr>
				</tbody>
			</table>
			<div class="links">
				<input type="submit" value="Edit" />

			</div>
		</form:form>
		<form action="/delete/${editTeam.id}" method="post">
			<input type="hidden" name="_method" value="delete"> <input
				type="submit" value="Delete">
		</form>
	</div>


</body>
</html>