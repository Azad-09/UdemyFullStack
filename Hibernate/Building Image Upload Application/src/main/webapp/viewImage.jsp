<%@page import="org.easy.hibernate.entity.Files"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Image</title>
</head>
<body>
<%!Files file; String path; int id;  %>

<% 
	file = (Files)request.getAttribute("file");
	path = (String)request.getAttribute("path");
	
%>

File ID: <%= file.getFile_id()  %> | File Name: <%= file.getFileName() %>
	<% 
		if(file.getLabel() != null)
			out.print(" | Label: " + file.getLabel());
	
		if(file.getCaption() != null)
			out.print(" | Caption: " + file.getCaption());
	%>
	<a href="${pageContext.request.contextPath}">Home</a>
	<a href="${pageContext.request.contextPath}/imageUpload?action=listingImages">List Available Image</a>
	
	<hr>
	<input alt="#" src="<%= path+file.getFileName() %>" type="image">
</body>
</html>