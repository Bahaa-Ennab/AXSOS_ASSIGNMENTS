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
	<h1 class="title">Save Travels</h1>
	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>edit</th>
					<th>delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<td><a href="/show/<c:out value="${expense.id}"></c:out>"><c:out value="${expense.expenseName}"></c:out></a></td>
						<td><c:out value="${expense.vendorName}"></c:out></td>
						<td><c:out value="${expense.amount}"></c:out></td>
						<td><a href="/<c:out value="${expense.id}"></c:out>">edit</a></td>
						<td><form action="/delete/${expense.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="table-container">
		<h1 class="title">Add an Expense</h1>
		<form:form action="/expenses" method="post" modelAttribute="expense">
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
	</div>
</body>
</html>