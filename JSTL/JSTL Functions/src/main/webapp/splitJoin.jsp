<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Split Join</title>
</head>
<body>
	<c:set var="links" value="${fn:split('www.google.com', '.') }" /> 
	<c:forEach var="link" items="${links}">
		${link}
		<br>
	</c:forEach>
	<br>
	
	Elements: ${fn:join(links, '?') }
	
</body>
</html>