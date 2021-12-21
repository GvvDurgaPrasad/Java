<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String name1=request.getParameter("name");
session.setAttribute("nm",name1);
%>
<a href="Second.jsp">Click to move</a>

</body>
</html>