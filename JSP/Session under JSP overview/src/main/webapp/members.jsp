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

Cookie[] cookies = request.getCookies();

if(cookies != null){
	
	for(Cookie cookie: cookies){
		if(cookie.getName().equals("user")){
			user = cookie.getValue();	
		}
		
		if(cookie.getName().equals("pass")  ){
			pass = cookie.getValue();
			
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionID = cookie.getValue();
		}
		
	}
}

if( sessionID == null || pass == null || user == null ){
	response.sendRedirect("login.jsp");
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