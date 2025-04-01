<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login Jsp</title>
</head>
<body><center><h1>
	<%
		String msg=(String)request.getAttribute("msg");
		out.println(msg+"<br><br>");
	
	%>

</h1>
<jsp:include page="CustomerLogin.html"/>
</body>
</html>