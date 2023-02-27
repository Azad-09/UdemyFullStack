<%-- JSP import is done using directives  --%>
<%@page import="java.util.Date,org.easy.servlets.UserDefined"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
	<%= new Date()  %>
	<br><br>
	
	<%-- Printing the demo Method of class UserDefined --%>
	<% 
		out.print(new UserDefined().demo());
	%>
	
</body>
</html>