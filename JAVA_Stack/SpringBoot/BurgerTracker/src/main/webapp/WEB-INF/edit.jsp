<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit details</title>
</head>
<body>
	<div class="table-container">
		<h1 class="title">edit Burger</h1>
		<form:form action="/burgers/${burger.id}" method="post" modelAttribute ="burger">
		    <input type="hidden" name="_method" value="put">
			<p>
				<form:label path="burgerName">burger Name</form:label>
				<form:errors path="burgerName" />
				<form:input path="burgerName" />
			</p>
			<p>
				<form:label path="restaurantName">restaurant Name</form:label>
				<form:errors path="restaurantName" />
				<form:input path="restaurantName" />
			</p>
			<p>
				<form:label path="rating">rating</form:label>
				<form:errors path="rating" />
				<form:input path="rating" />
			</p>
			<p>
				<form:label path="notes">notes</form:label>
				<form:errors path="notes" />
				<form:textarea type="notes" path="notes" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
		<a href="/">back</a>
	</div>

</body>
</html>