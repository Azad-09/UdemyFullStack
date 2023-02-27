<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set</title>
</head>
<body>
	<jsp:useBean id="User" class="org.easy.beans.User" scope="page"></jsp:useBean>
	
	<form action="getSessionProperty.jsp" method="post">
		First Name: <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="User"/>'> <br>
		Last Name: <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="User"/>'> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>