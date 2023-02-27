<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Display</title>
</head>
<body>
	Date: ${date} <br>
	Hello ${name} <br> 
	
	---------------------------------------------------------- <br>
	Your Team Mates: 
	
	<c:forEach var="temp" items="${team}">
	<br> ${temp}
	</c:forEach>
	
</body>
</html>