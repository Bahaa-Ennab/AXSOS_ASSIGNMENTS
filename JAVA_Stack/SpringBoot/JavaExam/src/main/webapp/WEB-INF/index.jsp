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
			<form:form action="/userlogin" method="post"
				modelAttribute="newLogin">
				<form:label path="email">email:</form:label>
				<form:input path="email" />
				<form:errors path="email" />



				<form:label path="password">Password:</form:label>
				<form:input path="password" type="password" />
				<form:errors path="password" />

				<input type="submit" value="Apply" />

			</form:form>
		</div>

		<br> <br>
		<div class="register-container">

			<form:form action="/register" method="post" modelAttribute="newUser">
				<form:label path="firstName">firstName:</form:label>
				<form:input path="firstName" />
				<form:errors path="firstName" />

				<form:label path="lastName">lastName:</form:label>
				<form:input path="lastName" />
				<form:errors path="lastName" />

				<form:label path="password">password:</form:label>
				<form:input path="password" type="password" />
				<form:errors path="password" />


				<form:label path="confirm">confirm password : </form:label>
				<form:input path="confirm" type="password" />
				<form:errors path="confirm" />


				<form:label path="email">email:</form:label>
				<form:input path="email" />
				<form:errors path="email" />


				<input type="submit" value="Apply!" />

			</form:form>
		</div>

	</main>

</body>
</html>