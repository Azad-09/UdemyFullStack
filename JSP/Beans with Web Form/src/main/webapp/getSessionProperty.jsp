<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get</title>
</head>
<body>
	<jsp:useBean id="User" class="org.easy.beans.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="User"/>
	
	First Name: <jsp:getProperty property="firstName" name="User"/> <br>
	Last Name: <jsp:getProperty property="lastName" name="User"/>
	
</body>
</html>