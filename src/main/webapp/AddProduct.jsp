<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="bean.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory System</title>
<style>
   html,body {
        height: 100%;
        padding: 0;
        margin: 0;
        background-color: #EEF3E2;
    }

    .udp{
	    font-size: 27px;
	    font-weight: 550;
	    display: block; 
	    text-align:center;
	    color:darkgreen;
		text-align:center;
		margin-top:30px;
    }	    
</style>
</head>
<body>
   <%@include file="ViewProduct.jsp" %>
   <span class="udp">
        <%
           String msg=(String) request.getAttribute("msg");
	       out.println(msg); 
	    %>
	</span> 
</body>
</html>