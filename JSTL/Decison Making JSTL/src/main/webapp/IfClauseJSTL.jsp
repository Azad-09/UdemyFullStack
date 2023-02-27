<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IFJSTL</title>
</head>
<body>
	<c:if test="${param.name == 'Azad'}">
		Hello Azad!! Welcome
	</c:if>
	Hello User
</body>
</html>