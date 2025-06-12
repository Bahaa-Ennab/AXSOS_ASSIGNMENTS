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
		<h1 class="title">New product</h1>
		<a href="/">Home</a>
		<form:form action="/products/add_product" method="post" modelAttribute="product">
			<p>
				<form:label path="name"><h2>Name : </h2></form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<p>
				<form:label path="description"><h2>description : </h2></form:label>
				<form:errors path="description" />
				<form:input path="description" />
			</p>
			<p>
				<form:label path="price"><h2>price : </h2></form:label>
				<form:errors path="price" />
				<form:input path="price" type="number"/>
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>

</body>
</html>