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
<title>Save Travels</title>
</head>
<body>

	<div class="table-container">
		<h1 class="title">New Dojo</h1>
		<form:form action="/add_dojo" method="post" modelAttribute="dojo">
			<p>
				<form:label path="name">dojo Name</form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>
</body>
</html>