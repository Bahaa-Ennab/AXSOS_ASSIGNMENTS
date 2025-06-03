<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show details</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="table-container">
		<h1 class="title">expense details</h1>
		<p>Expense name :<c:out value="${expense.expenseName}"></c:out> </p>
<p>Expense description :<c:out value="${expense.description}"></c:out> </p>
<p> vendor :<c:out value="${expense.vendorName}"></c:out> </p>
<p> amount spent :<c:out value="${expense.amount}"></c:out> $ </p>


		<a href="/">back</a>
	</div>

</body>
</html>