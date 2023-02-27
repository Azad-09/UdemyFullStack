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
	Gender: Male <form:radiobutton path="gender" value="Male"/> 
			Female <form:radiobutton path="gender"  value="Female"/>
	</p>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>