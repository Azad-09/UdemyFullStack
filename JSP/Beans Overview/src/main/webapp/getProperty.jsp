<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Property</title>
</head>
<body>
<%-- scope= application is applicable for all the browser. Changes in any browser will reflect in all --%>
<%-- scope= page will reflect changes on that particular page/ JSP  --%>
	<jsp:useBean id="User" class="org.easy.beans.User" scope="application"></jsp:useBean>
	First Name: <jsp:getProperty property="firstName" name="User"/> <br>
	Last Name: <jsp:getProperty property="lastName" name="User"/>
</body>
</html>