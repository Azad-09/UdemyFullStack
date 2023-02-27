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
	<!-- radiobuttons is used to for dynamic purpose -->
	Gender: <form:radiobuttons path="gender" items="${genderMap}"/>
	</p>
	<p>
	<!--  Country: <form:select path="country">
				<form:option value="India"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="UK" label="United Kingdom"></form:option>
				<form:option value="UAE" label="Emirates"></form:option>
				<form:option value="Srilanka"></form:option>
			</form:select> -->
			
			<!-- Dynamic way of using dropdown -->
			
	Country: <form:select path="country" items="${countryMap}"/>		
	</p>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>