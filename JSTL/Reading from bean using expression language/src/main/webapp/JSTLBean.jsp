<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BeanJSTLDemo</title>
</head>
<body>
	<jsp:useBean id="user" class="org.easy.beans.User" scope="page"></jsp:useBean>
	
	<c:out value="${user.toString()}"/>
	
</body>
</html>