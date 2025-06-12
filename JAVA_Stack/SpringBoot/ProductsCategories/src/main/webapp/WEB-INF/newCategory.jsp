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
<title>new category</title>
</head>
<body>

	<div class="table-container">
		<a href="/">Home</a>
		<form:form action="/categories/add_category" method="post"
			modelAttribute="category">
			<p>
				<form:label path="name">
					<h2>Name :</h2>
				</form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>

</body>
</html>