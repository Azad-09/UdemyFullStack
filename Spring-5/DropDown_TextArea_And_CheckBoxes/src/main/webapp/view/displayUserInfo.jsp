<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display User</title>
</head>
<body>
Details: <br>
Name: ${user.name} <br>
Gender: ${user.gender} <br>
Country: ${user.country} <br>
Introduction: ${user.intro} <br>
Visited Countries:
<ul>
<c:forEach var="temp" items="${user.visitedCountries }">
<li>${temp} </li>
</c:forEach>
</ul>
</body>
</html>