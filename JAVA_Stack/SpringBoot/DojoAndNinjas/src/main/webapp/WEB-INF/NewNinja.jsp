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

	<div class="table-container">
		<h1 class="title">New Ninja</h1>
		<form:form action="/ninja/create" method="post" modelAttribute="ninja">
			<p>
			<div class="inputs">
				<form:label path="dojo">Dojo: </form:label>
				<form:select path="dojo">
					<form:option value="" label="-- Select a Dojo --" />
					<c:forEach var="dojo" items="${dojos}">
						<form:option value="${dojo.id}" label="${dojo.name}" />
					</c:forEach>

				</form:select>
			</div>
			<form:errors path="dojo" cssClass="error" />
			<p>
			<div class="inputs">
				<form:label path="firstName">First Name: </form:label>
				<form:textarea path="firstName" />
			</div>
			<form:errors path="firstName" cssClass="error" />
			</p>
			<p>
			<div class="inputs">
				<form:label path="lastName">Last Name: </form:label>
				<form:textarea path="lastName" />
			</div>
			<form:errors path="lastName" cssClass="error" />
			</p>
			<p>
			<div class="inputs">
				<form:label path="age">Age: </form:label>
				<form:textarea path="age" />
			</div>
			<form:errors age="name" cssClass="error" />
			</p>
			<input Class="button" type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>