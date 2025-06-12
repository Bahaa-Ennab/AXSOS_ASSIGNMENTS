<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<meta charset="UTF-8">
<title>new product</title>
</head>
<body>

	<div class="table-container">
		<h1 class="title">${product.name}</h1>
		<a href="/">Home</a>
		<hr />
		<h2>Categories:</h2>
		<ul>
			<c:forEach var="category" items="${categories}">
				<li><c:out value="${category.name}"></c:out></li>
			</c:forEach>
		</ul>
		<hr />
		<form:form action="/products/create_relation/${product.id}"
			method="post" modelAttribute="producttt">
			<p>
			<div class="inputs">
				<form:label path="categories">Name: </form:label>
				<form:select path="categories">
					<form:option value="" label="-- Select a Category --" />
					<c:forEach var="categories" items="${restOfCategories}">
						<form:option value="${categories.id}" label="${categories.name}" />
					</c:forEach>
				</form:select>
			</div>
			<input Class="button" type="submit" value="Submit" />
		</form:form>
	</div>

</body>
</html>