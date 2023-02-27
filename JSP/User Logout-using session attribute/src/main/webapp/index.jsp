<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style type="text/css">
a {
	margin-left: 47%;
	color: rgba(0,255,142,1);
}

</style>
</head>
<body>
<h1 style="margin-left: 45%; color: orangered">HOME</h1>
<a href="<%=request.getContextPath()%>/SiteController?action=Login" >Login</a>
</body>
</html>