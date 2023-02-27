<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trim&EscapeXML</title>
</head>
<body>
	${fn:trim('     Bolo    Radhe     Shyam    ' ) }
	
	<h1>Good Morning!!!</h1>
	
	${fn:escapeXml(	"<h1>Good Morning!!!</h1>") }
</body>
</html>