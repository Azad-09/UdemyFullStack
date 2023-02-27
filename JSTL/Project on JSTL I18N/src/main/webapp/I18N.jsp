<%@ page language="java" contentType="text/html; charset=UTF-8	"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I18N</title>
</head>
<body>
	View website in: <br> 
	<a href="?locale=en_GB">United Kingdom</a> <br>
	<a href="?locale=hi_IN">India (Hindi)</a> <br>
	<a href="?locale=ja_JP">Japan</a> <br>
	<a href="?locale=mk_MK">Macedonia </a> <br>
	-------------------------------------------------------------
	<br> <br>
	<fmt:setLocale value="${param.locale}" />
	
	<fmt:bundle basename="i18n/wesite">
		<p><fmt:message key="label.hello">Azad</fmt:message> </p>
		<p><fmt:message key="label.welcome"/></p>
		<p><fmt:message key="label.thanks"/></p>
	</fmt:bundle>
	
	Locale: ${param.locale}
</body>
</html>