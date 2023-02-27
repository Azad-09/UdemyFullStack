<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loop</title>
</head>
<body>

<% 
String[] names = new String[3];
names[0] = "Azad";
names[1] = "Ankit";
names[2] = "Aishwarya";

%>
	<c:forEach var="i" begin="2" end="20" step="2">${i}<br> </c:forEach>
	
	<c:forEach items="<%=names%>" var="name">
		<br> ${name} <br>		
	</c:forEach>
</body>
</html>




