<%@page import="org.easy.hibernate.entity.Files"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File List</title>
</head>

<%!String form;
	int fileId;%>

<body>
	<h1>Listing Images</h1>
	<br>
	<br>

	<table border="1">
		<tr>
			<th>Preview</th>
			<th>Available information</th>
			<th>Update information</th>
			<th>Action</th>

			<%
			String path = (String) request.getAttribute("path");
			List<Files> files = (List<Files>) request.getAttribute("files");
			for (Files file : files) {
				out.print("<tr><td><img src=" + path + file.getFileName() + " height='200'></td>");

				out.print("<td><ul>" + "<li> File ID: " + file.getFile_id() + "</li>" + "<li> File Name: " + file.getFileName()
				+ "</li>" + "<li> File Label: " + file.getLabel() + "</li>" + "<li> File Caption: " + file.getCaption()
				+ "</li>" + "</ul></td>");
				fileId = file.getFile_id();

				String form = "<form action='imageUpload' method='post'>" + "Label: <input type='text' name='label'><br><br>"
				+ "Caption: <input type='text' name='caption'><br><br>" + "<input type='hidden' name='fileId' value='"
				+ fileId + "'>" + "<input type='hidden' name='action' value='updateInformation'>"
				+ "<input type='hidden' name='fileName' value='" + file.getFileName() + "'>	"
				+ "<input type='submit' value='Update'>" + "</form>";

				out.print("<td>" + form + "</td>");

				out.print("<td><ul><li><a href='" + request.getContextPath() + "/imageUpload?action=viewImage&fileId="
				+ file.getFile_id() + "'>View Image</li>");
				
				out.print("<li><a href='" + request.getContextPath() + "/imageUpload?action=deleteImage&fileId="
						+ file.getFile_id()
						+ "' onclick=\"if(!confirm('Are you sure to delete the user?')) return false\">Delete Image</a></li></ul></td></tr>");
			}
			%>
		
	</table>

	<input type="button" src="/index.jsp" value="Return">


</body>
</html>