<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
	<jsp:useBean id="User" class="org.easy.beans.User" scope="application"></jsp:useBean>
	<jsp:setProperty property="firstName" name="User" value="Azad"/>
	<jsp:setProperty property="lastName" name="User" value="Mahapatra"/>
	Values have been set!! <br>
	
	First Name: <jsp:getProperty property="firstName" name="User"/> <br>
	Last Name: <jsp:getProperty property="lastName" name="User"/>
</body>
</html>