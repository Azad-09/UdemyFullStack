<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<c:import url="/User.xml" var="XMLFile"/>
	<x:parse xml="${XMLFile}" var="XMLDoc"/>
	<br> User I:: <br>
	Name:	<x:out select="$XMLDoc/users/user/name"/>
<br> Age: <x:out select="$XMLDoc/users/user/age"/>
<br> Gender: <x:out select="$XMLDoc/users/user/gender"/>
	<br>
	<br> User II:: <br>
	Name:	<x:out select="$XMLDoc/users/user[2]/name"/>
<br> Age: <x:out select="$XMLDoc/users/user[2]/age"/>
<br> Gender: <x:out select="$XMLDoc/users/user[2]/gender"/>
	<br>
	<br> User III:: <br>
	Name:	<x:out select="$XMLDoc/users/user[3]/name"/>
<br> Age: <x:out select="$XMLDoc/users/user[3]/age"/>
<br> Gender: <x:out select="$XMLDoc/users/user[3]/gender"/>
</body>
</html>