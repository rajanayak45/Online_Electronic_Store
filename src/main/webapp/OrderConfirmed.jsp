<%@page import="pack1.CustomerBean"%>
<%@page import="pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmed</title>
<style>
    body {
      font-family: sans-serif;
      margin: 0;
      padding: 0;
      background-image: url('data:image/jpeg;base64,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'); 
      background-size: cover;
      background-position: center center;
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh; 
    }

    h1 {
      text-align: center;
      color: rgb(255, 128, 0);
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
    }
    i,u{
		text-align: center;
      color: rgb(103, 103, 103);
      text-shadow: 2px 2px 4px rgb(192, 192, 192,0.6);
	}

    a{
      width: 90px;
      background-color: rgb(192, 192, 192,0.6); 
      padding: 3px;
      border-radius: 10px;
      box-shadow: 0 2px 5px rgb(0, 0, 0);
    }

    input[type="text"],
    input[type="password"] {
      width: 200px;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid rgb(128, 64, 64);
      border-radius: 3px;
    }

    input[type="submit"] {
      background-color: rgb(64, 128, 128,0.4);
      color: rgb(196, 64, 0);
      padding: 10px 20px;
      border: 1px solid rgb(128, 64, 64);
      border-radius: 3px;
      cursor: pointer;
    }
  </style>
</head>
<body><center><h1>
	<%
		CustomerBean cbean=(CustomerBean)session.getAttribute("cb");
			
	//ProductBean pbean=(ProductBean)request.getAttribute("pbean");
		String msg=(String)request.getParameter("Purchased");
		String pName=(String)request.getAttribute("pName");
		String pPrice=(String)request.getAttribute("pPrice");
		
		
	  	out.println("Hello "+cbean.getcFname()+"!! <br><br>");
	  	out.println("You have charged " + pPrice +"rs!! <br><br>");
	  	out.println("Your Order is placed Successfully!! <br><br>");
	%>
	
	<a href="view2">View Products</a><br><br>
	<a href="logout">Logout</a><br><br>


</h1>

</body>
</html>