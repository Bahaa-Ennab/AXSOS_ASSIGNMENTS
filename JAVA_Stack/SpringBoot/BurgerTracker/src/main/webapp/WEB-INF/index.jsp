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
<title>Burger Tracker</title>
</head>
<body>
	<h1 class="title">Burger Tracker</h1>
	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>Burger Name</th>
					<th>Restaurant Name</th>
					<th>Rating (out of 5)</th>
					<th>Edit</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="burger" items="${burgers}">
					<tr>
						<td><c:out value="${burger.burgerName}"></c:out></td>
						<td><c:out value="${burger.restaurantName}"></c:out></td>
						<td><c:out value="${burger.rating}"></c:out></td>
						<td><a href="/<c:out value="${burger.id}"></c:out>">edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="table-container">
		<h1 class="title">Add Burger</h1>
		<form:form action="/burgers" method="post" modelAttribute="burger">
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
	</div>
</body>
</html>