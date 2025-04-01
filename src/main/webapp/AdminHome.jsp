<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home jsp</title>
<style>
  body {
  	background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuBsOPzZRw-cwDEdePEqlDqNzc_Agw8Is9DQ&s');
    font-family: sans-serif;
    margin: 0;
    padding: 0;
    background-size: cover;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background-color: #f0f0f0; /* Light gray background */
  }

  h1 {
    text-align: center;
    color: gray;
    text-shadow: navy;
    color: gray; /* Blue links */
    padding: 10px 20px;
    border: 1px solid gray;
    background-color: #f0f0f0;
    border-radius: 5px;
    margin: 100px;
    display: inline-block;
  }

  a {
    text-decoration: underline;
    color: red; /* Blue links */
    padding: 10px 20px;
    border: 1px solid #007bff;
    background-color: aqua;
    border-radius: 5px;
    margin: 10px;
    display: inline-block;
  }
</style>
</head>
<body><center><h1>
	<%
		AdminBean abean =(AdminBean)session.getAttribute("abean");
		out.println("Welcome Mr."+abean.getaFname()+"!!!"+"<br><br>");
	%>
	<a href="AddProduct.html">Add Product</a><br><br>
	<a href="view1">View Product</a><br><br>
	<a href="logout">Logout</a><br><br>
	
</h1>

</body>
</html>