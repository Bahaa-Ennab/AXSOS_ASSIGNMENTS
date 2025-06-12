<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">

<title>Home</title>
</head>
<body>
	<main>
		<h1>Home Page</h1>

		<div class="links">
			<a href="/products/new">New Product</a> | <a href="/categories/new">New Category</a>
		</div>

		<hr />

		<div class="table-container">
			<div class="column">
				<h2>Products</h2>
				<ul>
					<c:forEach var="product" items="${products}">
						<li><a href="/products/<c:out
									value="${product.id}"></c:out>"><c:out
									value="${product.name}"></c:out></a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="column">
				<h2>Categories</h2>
				<ul>
					<c:forEach var="category" items="${categories}">
						<li><a href="/categories/<c:out
									value="${category.id}"></c:out>"><c:out
									value="${category.name}"></c:out></a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</main>
</body>
</html>