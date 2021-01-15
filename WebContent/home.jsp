<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import="isi.exo.entity.productentity , java.util.ArrayList " %>
<%@ page  import="isi.exo.entity.userentity , java.util.ArrayList " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% userentity user = (userentity)session.getAttribute("usersession");  %>
<label>hello <%= user.getFirstName() %></label>
<h3> WELCOME HOME </h3>
<a href="CartServlet">cart</a>
<fielset>
<legend>Filter by Category</legend>
<form id="frm"action="ProductServlet" method="get">
<br>
<select name="category" >
<option value="1">Category1</option>
<option value="2">Category2</option>
<option value="3">Category3</option>
<option value="4">Category4</option>
</select>
<input type="submit"  value="SUBMIT">

</form>
</fielset>


<%
ArrayList<productentity> list = (ArrayList<productentity>) request.getAttribute("productlist");
%>
<% if(list != null && list.size() > 0){ %>
<% for (productentity s : list){ %>
    <ul>
        <li>Product name:<%=s.getName() %></li>
        <li>Category: <%=s.getCategory() %></li>
        <li>Description: <%=s.getDescription() %></li>
        <li>Image :<img src="<%=s.getImage() %>"></li>
       	<li><a href="CartServlet?action=add&id=<%= s.getProductID() %>">add</a></li>
    </ul>
<%} %>
<%} else { %>
   <h2>No Data found for this request</h2>
<%} %>
</body>
</html>