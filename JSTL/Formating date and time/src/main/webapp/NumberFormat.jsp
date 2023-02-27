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
<title>Format Number</title>
</head>
<body>
	<c:set var="someNumber"  value="654321.123456"></c:set>
	<c:out value="${someNumber}"></c:out>
	<br>Max Integer Number: <strong> <fmt:formatNumber type="number" maxIntegerDigits="3" value="${someNumber }" /> </strong>
	<br>Max Fraction Number: <strong><fmt:formatNumber type="number" maxFractionDigits="2" value="${someNumber }" /> </strong>
	<fmt:setLocale value="hi_IN"/>
	<br>Currency: <fmt:formatNumber value="${someNumber}" type="currency" />
	<fmt:setLocale value="af-ZA"/>
	<br>Currency: <fmt:formatNumber value="${someNumber}" type="currency" />
	
	
</body>
</html>