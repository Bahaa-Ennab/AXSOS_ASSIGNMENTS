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
			<c:out value="${user.userName}"></c:out>
		</h1>
		<a href="/logout">Log out</a>
	</div>

	<hr />
	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>Team Name</th>
					<th>Skill Level</th>
					<th>Game Day</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="team" items="${teams}">
					<tr>
						<td><a href="/team/${team.id}"><c:out value="${team.teamName}"></c:out></a></td>
						<td><c:out value="${team.skillLvl}"></c:out></td>
						<td><c:out value="${team.gameDay}"></c:out></td>
					</tr>
				</c:forEach>
				<tr><td><a href="/team/add-team"><button>create new Team</button></a><td/></tr>

			</tbody>
		</table>
				
		
	</div>

</body>
</html>