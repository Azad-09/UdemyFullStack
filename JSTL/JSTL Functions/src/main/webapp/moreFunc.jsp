<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>More Func()</title>
</head>
<body>
		<c:set var="we" value="org.easy.func"/>
		
		${fn:startsWith("org.easy.func", "org") } 		
	<br>${fn:endsWith(we, "nc") }
	<br>${fn:contains(we, "EASY") }
	<br>${fn:containsIgnoreCase(we, "EASY") }
</body>
</html>