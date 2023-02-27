<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choose/When</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.lang == 'en' }">Looking For English Page</c:when>
		<c:when test="${param.lang == 'ja' }">Looking For Japanese Page</c:when>
		<c:otherwise>Looking for something good</c:otherwise>
	
	</c:choose>

</body>
</html>