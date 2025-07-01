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
	<div class="table-container">
		<h1 class="title">edit talk</h1>
		<form:form action="/updatetalk/${talkedit.id}" method="post"
			modelAttribute="talkedit">
			<input type="hidden" name="_method" value="put">
			<p>
				<form:label path="title">
					<h2>title :</h2>
				</form:label>
				<form:errors path="title" />
				<form:input path="title" />
			</p>
			<p>
				<form:label path="talkDate">
					<h2>talkDate :</h2>
				</form:label>
				<form:errors path="talkDate" />
				<form:input path="talkDate" type="date" />
			</p>
			<p>
				<form:label path="talkDetails">
					<h2>talkDetails :</h2>
				</form:label>
				<form:textarea path="talkDetails" />
				<form:errors path="talkDetails" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
		<a href="/home">back</a>
	</div>


</body>
</html>