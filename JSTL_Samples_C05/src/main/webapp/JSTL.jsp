<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Core Tags</title>
</head>
<body>

<% int[] arr={12,32,34,56,78};
request.setAttribute("numArr",arr);
%>

<c:set var="num" value="10"></c:set>
<h1><c:out value="${num*10+50}"></c:out></h1>

<c:forEach var="i" begin="1" end="5">
<h1><c:out value="${i}"></c:out></h1>
</c:forEach>

<c:forEach var="j" items="${requestScope.numArr}">
<p><c:out value="${j}"></c:out></p>
</c:forEach>

</body>
</html>