<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Some More Func()</title>
</head>
<body>
<%-- 
1. toLowerCase()
2. toUpperCase()
3. indexOf()
4. replace()
5. substring()
6. substringBefore()
7. substringAfter()
 --%>
 
 ${fn:toLowerCase("RADHESHYAM") }
 <br> ${fn:toUpperCase("boloharenaam") }
 <br> ${fn:indexOf("boloharenaam" , "n") }
 <br> ${fn:replace("boloharenaam" , "hare", "radhe") }
 <br> ${fn:substring("boloharenaam", 4, 8) }
 <br> ${fn:substringBefore("boloharenaam", "hare") }
 <br> ${fn:substringAfter("boloharenaam", "hare") }
 
</body>
</html>