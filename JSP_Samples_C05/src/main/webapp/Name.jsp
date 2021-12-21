<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% out.print("Gvv");%>     <!-- scriplet tag   ----  out- is implicit object -->
<br><br>
<%= "Prasad"  %>           <!-- expression tag -->
<br><br>
<%! int a=10,b=20; %>           <!-- declaration tag -->
<% out.print(a+b); %>

</body>
</html>