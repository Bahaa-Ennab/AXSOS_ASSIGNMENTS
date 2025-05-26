<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>AXSOS Academy Programs Page</title>
</head>
<body>
    <h1>AXSOS Academy Programs</h1>
    <c:forEach var="oneProgram" items="${programsFromMyController}">
        <p><c:out value="${oneProgram}"></c:out></p>
    </c:forEach>
</body>
</html>