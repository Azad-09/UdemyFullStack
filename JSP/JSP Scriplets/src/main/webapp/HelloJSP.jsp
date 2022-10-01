<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression</title>
</head>
<body>
	<h1 style="color: red;">Hello JSP</h1>

	<%-- JSP Declaration (Here we can declare a method) --%>
	<%!public int number() {
		return 21 + 21;
	}%>

	<%-- JSP Expression --%>
	<p>
		The value of X is:
		<%=number()%></p>


	<%-- JSP Scriplets (It will not allow access specifiers)--%>
	<%
	int s = 21;
	out.println(s);
	if (s > 20) {
		out.print("S is greater than 20");
	} else {
		out.print("S is less than 20");
	}
	%>
</body>
</html>