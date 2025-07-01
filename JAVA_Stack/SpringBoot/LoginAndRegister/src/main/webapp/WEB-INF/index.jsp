<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">

<meta charset="UTF-8">
<title>Login Register</title>
</head>
<body>
<main>
	<div class="login-container">
		<form:form action="/userlogin" method="post" modelAttribute="newLogin">
			<form:label path="email">email:</form:label>
			<form:input path="email" />


			<form:label path="password">Password:</form:label>
			<form:input path="password" type="password" />



			<input type="submit" value="Apply" />

			<h3>Summary:</h3>

			<form:errors path="email" />
			<br>
			<form:errors path="password" />
			<br>

		</form:form>
	</div>

	<br>
	<br>
	<div class="register-container">

		<form:form action="/register" method="post" modelAttribute="newUser">
			<form:label path="userName">Username:</form:label>
			<form:input path="userName" />

			<form:label path="password">password:</form:label>
			<form:input path="password" type="password" />

			<form:label path="confirm">confirm password : </form:label>
			<form:input path="confirm" type="password" />

			<form:label path="email">email:</form:label>
			<form:input path="email" />

			<input type="submit" value="Apply!" />

			<h3>Summary:</h3>

			<form:errors path="userName" />
			<br>
			<form:errors path="password" />

			<form:errors path="email" />

			<form:errors path="confirm" />
		</form:form>
	</div>

</main>

</body>
</html>