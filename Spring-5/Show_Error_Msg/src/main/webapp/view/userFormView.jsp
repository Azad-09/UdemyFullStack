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
		<form:errors path="name" cssStyle="color:red" />
		</p>
	<p>

	Gender: Male: <form:radiobutton path="gender" required="true" value="male"/> 
			Female: <form:radiobutton path="gender" required="true" value="female"/>
	</p>
	<p>	
	Country:<form:select path="country">
		<form:option value="India" />		
		<form:option value="England" />		
		<form:option value="USA" label="The United States" />		
		<form:option value="Australia" />		
		</form:select>
	</p>
	<p>
	Introduction: <form:textarea path="intro" required="true"/>	
		<p>
		<form:errors path="intro" cssStyle="color:red" />
		</p>
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