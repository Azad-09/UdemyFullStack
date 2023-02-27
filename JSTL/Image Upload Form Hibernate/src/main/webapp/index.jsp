<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Upload</title>
</head>
<body>
	<form action="imageUpload" method="post" enctype="multipart/form-data">
		Select Image: <input type="file" name="files" multiple="multiple" > <br>
		<input type="submit" value="Upload" name="btn">
	</form>
</body>
</html>