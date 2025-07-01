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
	<div class="links">
		<h1>
			Welcome,
			<c:out value="${user.firstName}"></c:out>
		</h1>
		<a href="/logout">Log out</a>
	</div>

	<hr />
	<div class="links">
		<h1>Add a Talk</h1>
	</div>
	
	<div class="table-container">
		<form:form action="/addtalk" method="post" modelAttribute="newTalkk">
		<form:input path="${user.Id}" type="hidden" value="${user.id}"/>
			<p>
				<form:label path="title"><h2>title : </h2></form:label>
				<form:errors path="title" cssClass="error" />
				<form:input path="title" />
			</p>
			<p>
				<form:label path="talkDate"><h2>talkDate : </h2></form:label>
				<form:errors path="talkDate" cssClass="error" />
				<form:input path="talkDate" type="date"/>
			</p>
			<p>
				<form:label path="talkDetails"><h2>talkDetails : </h2></form:label>
				<form:textarea path="talkDetails"/>
				<form:errors path="talkDetails" cssClass="error" />
			</p>
			<div class="links">
			<input type="submit" value="Create" />
			
			</div>
		</form:form>
			<a href="/home"><button>Back TO Dashboard</button></a>
	</div>


</body>
</html>