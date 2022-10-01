<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEmo</title>
</head>
<body>
	Message from DEmo Page
	<%-- <jsp:forward page="Forward.jsp"></jsp:forward>  --%>
	
	<%
	// Forward will only forward the details of page including title and content(not to this page)	 
	request.getRequestDispatcher("Forward.jsp").forward(request,response);
	
	// Redirect will directly switch to that page which is mentioned (http://localhost:9494/Forward_And_Redirect_under_JSP/Redirect.jsp)
	response.sendRedirect("Redirect.jsp");
	
	%>
	
</body>
</html>