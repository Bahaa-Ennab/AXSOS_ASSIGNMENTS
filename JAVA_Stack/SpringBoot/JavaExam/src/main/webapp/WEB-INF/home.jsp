<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style2.css">

<title>Welcome!</title>
</head>
<body>
	<div class="links">
		<h1>
			Welcome,
			<c:out value="${user.firstName}"></c:out>
		</h1>
		<a href="/logout">Log out</a>
	</div>

	<hr />
	<div class="links">
		<h1>TalkTracker Dashboard</h1>
		<a href="/show_addTalk"><button>Add a Talk</button></a>
	</div>

	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Talk Title</th>
					<th>Talk Date</th>
					<th>Speaker</th>
					<th>Attended</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="talk" items="${talks}">
					<tr>
						<td><c:out value="${talk.id}"></c:out></td>
						<td><a href="/talk/${talk.id}"><c:out value="${talk.title}"></c:out></a></td>
						<td><c:out value="${talk.talkDate}"></c:out></td>
						<td><c:out value="${talk.user.firstName}"></c:out></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>