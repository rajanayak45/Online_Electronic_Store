<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid Jsp</title>
</head>
<body><center>
	<h1>
		<%
			String msg=(String)request.getAttribute("invalid");
			out.println(msg);
		
		%>
	
	
	</h1>

	<jsp:include page="BuyProduct.jsp"/>



</body>
</html>