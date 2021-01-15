<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page language="java"
	import="isi.exo.entity.productentity,java.util.Map,java.util.HashMap,java.util.ArrayList,java. util. Iterator"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Your Cart</h3>
<% HashMap<Integer,productentity> productListInSession = (HashMap<Integer,productentity>)session.getAttribute("sessionCart") ; %>
	<%Iterator hmIterator = productListInSession.entrySet().iterator(); %>
	
<%while (hmIterator.hasNext()) {  %>
			<% Map.Entry mapElement = (Map.Entry)hmIterator.next(); %>
			<% productentity product = (productentity)mapElement.getValue(); %>
    <ul>
        <li>Product name:<%=product.getName() %></li>
        <li>Category: <%=product.getCategory() %></li>
        <li>Description: <%=product.getDescription() %></li>
        <li>Image :<%=product.getImage() %></li>
       	<li><a href="CartServlet?action=remove&remove_id=<%= product.getProductID() %>">remove</a></li>
    </ul>
<%} %>
<a href="OrderServlet">Proceed to check out</a>
<a href="ProductServlet">homepage</a>
</body>
</html>