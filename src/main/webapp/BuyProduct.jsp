<%@page import="java.util.ArrayList"%>
<%@page import="pack1.CustomerBean"%>
<%@page import="pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Product jsp</title>
<style>
body {
  font-family: sans-serif;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f0f0f0;
  background-image: url('data:image/jpeg;base64,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');
  background-size: cover;
}

h1 {
  text-align: center;
  color: lime;
}
i,u{
		text-align: center;
      color: rgb(103, 103, 103);
      text-shadow: 2px 2px 4px rgb(192, 192, 192,0.6);
	}

form {
  background-color: rgb(192, 192, 192,0.6);
  padding: 20px;
  border: 1px solid rgb(128, 255, 255);
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  
}

input[type="text"] {
  width: 200px;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

input[type="submit"] {
  background-color: #4CAF50;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 3px;
  cursor: pointer;
}
</style>
</head>
<body><center><h1>
		<%
		CustomerBean cb=(CustomerBean)session.getAttribute("cb");
		ProductBean pb=(ProductBean)request.getAttribute("pbean");
		ArrayList<ProductBean> al = (ArrayList<ProductBean>)request.getAttribute("al");
	    String msg = (String) request.getAttribute("invalid");
	
	    //if (msg != null) {
	      //  out.println(msg+"<br><br>");
	    //}
	
	    //if (pb == null) {
	%>
	      <!--     <p style="color:red;">Product details are not available.</p>
	-->
	<%
	    //} else {
	%>
	    <form action="buyProduct" method="post">
	        Product Code <input type="text" name="pCode" value="<%=pb.getpCode() %>" readonly="readonly"><br><br>
	        Product Name <input type="text" name="pName" value="<%=pb.getpName() %>" readonly="readonly"><br><br>
	        Product Company <input type="text" name="pCompany" value="<%=pb.getpCompany() %>" readonly="readonly"><br><br>
	        Product Price <input type="text" name="pPrice" value="<%=pb.getpPrice() %>" readonly="readonly"><br><br>
	        Product Quantity <input type="text" name="pQty" value="<%=pb.getpQuantity() %>" readonly="readonly"><br><br>
	        Required No. <input type="number" name="reqNo" required><br><br>
	
	        <input type="submit" value="Buy">
	    </form>
	<%
	  // }
	%>






</h1>

</body>
</html>