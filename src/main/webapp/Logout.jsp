<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body><center><h1>
	<%
	
		session.invalidate();
		out.println("Logged-Out Successsfully<br><br>");	
	%>
	</h1>
	<jsp:include page="index.html" />
</body>
</html>