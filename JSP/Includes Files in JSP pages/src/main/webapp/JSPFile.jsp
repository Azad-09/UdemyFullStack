<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- For adding static comment  --%>
<%@ include file="file1.txt" %>

<br><br>

<%-- For adding dynamic comment  --%>
<jsp:include page="file2.txt"></jsp:include>
</body>
</html>