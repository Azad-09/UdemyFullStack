<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Length</title>
</head>
<body>
	<% 
		String [] names = {"Radhe", "Shyam", "Happu"};
	
	%>
	
	<c:set var="nameArray" value="<%=names%>"></c:set>
	<p>Length of the new Array is ${fn:length(nameArray)}</p> 

	${fn:length('RageShyamBoleHareNaam')}
</body>
</html>