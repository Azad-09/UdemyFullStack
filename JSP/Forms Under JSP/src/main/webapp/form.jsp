<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action="submit.jsp" method="post">
		Full Name: <input type="text" name="name" /> <br>
		Gender: <input type="radio" name="gender" value="male" > Male
				<input type="radio" name="gender" value="female"> Female <br>
				
		Language Known: <input type="checkbox" name="language" value="English"> English
						<input type="checkbox" name="langugae" value="Hindi"> Hindi
						<input type="checkbox" name="language" value="French"> French <br>
						
		Country: <select name="country">
					<option value="India">India</option>
					<option value="Australia">Australia</option>
					<option value="England">England</option>
					<option value="Russia">Russia</option>
					<option value="China">China</option>		
				</select> <br>
				<input type="submit" value="Submit">	
	</form>
</body>
</html>