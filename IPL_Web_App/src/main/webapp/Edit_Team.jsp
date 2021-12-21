<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="IPLServlet" method="post">
Name:<input type="text" name="team_name" value="${team.name}"><br><br>
City:<input type="text" name="city" value="${team.city}"><br><br>
State:<input type="text" name="state" value="${team.state}"><br><br>
<input type="hidden" name="team_id" value="${team.teamid}">
<input type="submit" name="request_type" value="edit team">
</form>
</body>
</html>