<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String fullname=request.getParameter("name"); %>
<% String mailid=request.getParameter("email"); %>
<h2>Hey, <% out.print(fullname); %> <br><br> your email id is: <%= mailid %></h2>

</body>
</html>