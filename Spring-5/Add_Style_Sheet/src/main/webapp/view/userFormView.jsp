<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h1>Submit your Information</h1>
<hr>
<!-- path will use the setter method of the variable and provide value to that User Model  -->
<!-- model is nothing but a container of data > -->	
	<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name" required="true" placeholder="Enter Name" />
	<p>
	<!-- "radiobuttons" is used to for dynamic purpose -->
	Gender: <form:radiobuttons path="gender" required="true" items="${genderMap}"/>
	</p>
	<p>	
	<!-- Dynamic way of using dropdown -->	
	Country: <form:select path="country" items="${countryMap}"/>		
	</p>
	<p>
	Introduction: <form:textarea path="intro" required="true"/>	
	</p>
	<p>
	Visited Countries: <br>
	
	 China: <form:checkbox path="visitedCountries" value="China" />
	 Thailand: <form:checkbox path="visitedCountries" value="Thailand"/>
	 Japan: <form:checkbox path="visitedCountries" value="Japan"/>
	 Nepal: <form:checkbox path="visitedCountries" value="Nepal"/>
	</p>
	<p>
	Accept Agreement: <form:checkbox path="" required="true" value="accept" />
	</p>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>