<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Members Only</title>
</head>
<body>

<%
String user=null, pass=null, sessionID=null;
	if(request.getSession().getAttribute("username") == null|| request.getSession().getAttribute("pass") == null) {
		response.sendRedirect(request.getContextPath()+"SiteController?action=Login");
	}else{
		user = request.getSession().getAttribute("username").toString();
		pass = request.getSession().getAttribute("pass").toString();
		
		sessionID = request.getSession().getId();
	}


if( sessionID == null || pass == null || user == null ){
	
}

%>
	Only fans!!! <br>
	Username: <%= user %> <br>
	Pass: <%= pass %> <br> 
	Current Session: <%= sessionID %> 
	<form action="<%=request.getContextPath()%>/MemberAreaController" method="post">
		<input type="hidden" name="action" value="destroy">
		<input type="submit" value="Logout">
	</form>
</body>
</html>