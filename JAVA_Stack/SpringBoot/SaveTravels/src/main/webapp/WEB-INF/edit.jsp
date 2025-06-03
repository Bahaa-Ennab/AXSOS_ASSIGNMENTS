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
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="table-container">
		<h1 class="title">edit Burger</h1>
	<form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
			<input type="hidden" name="_method" value="put">
			<p>
				<form:label path="expenseName">expense Name</form:label>
				<form:errors path="expenseName" />
				<form:input path="expenseName" />
			</p>
			<p>
				<form:label path="vendorName">vendor Name</form:label>
				<form:errors path="vendorName" />
				<form:input path="vendorName" />
			</p>
			<p>
				<form:label path="amount">amount</form:label>
				<form:errors path="amount" />
				<form:input path="amount" />
			</p>
			<p>
				<form:label path="description">notes</form:label>
				<form:errors path="description" />
				<form:textarea type="description" path="description" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
		<a href="/">back</a>
	</div>

</body>
</html>