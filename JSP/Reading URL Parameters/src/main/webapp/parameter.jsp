<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

out.print("Value 1: " + request.getParameter("getValue1") + ";   ");
out.print("Value 2: " + request.getParameter("getValue2") + ";");

%>
</body>
</html>