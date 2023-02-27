<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
<!-- path will use the setter method of the variable and provide value to that User Model  -->
<!-- model is nothing but a container of data > -->	
	<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name"/>
	<p>
	<!-- "radiobuttons" is used to for dynamic purpose -->
	Gender: <form:radiobuttons path="gender" items="${genderMap}"/>
	</p>
	<p>	
	<!-- Dynamic way of using dropdown -->	
	Country: <form:select path="country" items="${countryMap}"/>		
	</p>
	<p>
	Introduction: <form:textarea path="intro"/>	
	</p>
	<p>
	Visited Countries: <br>
	
	 China: <form:checkbox path="visitedCountries" value="China"/>
	 Thailand: <form:checkbox path="visitedCountries" value="Thailand"/>
	 Japan: <form:checkbox path="visitedCountries" value="Japan"/>
	 Nepal: <form:checkbox path="visitedCountries" value="Nepal"/>
	</p>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>