<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time Format</title>
</head>
<body>
	<c:set var="date" value="<%= new java.util.Date()%>"/>
	<c:out value="${date}"></c:out>
	
	<br>Time: <strong><fmt:formatDate type="time" value="${date}"/></strong>
	<br>Date: <strong><fmt:formatDate type="date" value="${date}"/></strong>
	<br>Date & Time: <strong><fmt:formatDate type="both" value="${date}"/> </strong>
	<br>Date & Time: <strong><fmt:formatDate type="both" value="${date}" timeZone="	GMT-7:00"/> </strong>
	<br>
	<fmt:setLocale value="af-ZA"/>
	<br>Date & Time: <strong><fmt:formatDate type="both" value="${date}" timeZone="	GMT-7:00"/> </strong>
	
</body>
</html>