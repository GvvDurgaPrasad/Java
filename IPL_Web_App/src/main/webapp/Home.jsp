<%@page import="java.util.List" %>
<%@ page import="IPL_ENTITIES.Team" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
<title>web app</title>
</head>
<body>

<h1 align="center">Welcome to IPL application</h1>
<form action="IPLServlet" method="post">
<div class="container">
<table class="table table-striped">
<tr>                                            
<th>Team id</th>
<th>Name</th>
<th>City</th>
<th>State</th>
</tr>

<c:forEach var="team" items="${allTeams}">
<tr>
<td><input type="radio" name="team_id" value="${team.teamid}"></td>
<td>${team.name}</td>
<td>${team.city}</td>
<td>${team.state}</td>
</tr>
</c:forEach>

</table>
</div>

<div class="container">
<a href="./Add_Team.html" class="btn btn-info" role="button" >Add Team</a>
<input type="submit" class="btn btn-info" value="delete team" name="request_type">
<input type="submit" class="btn btn-info" value="modify team" name="request_type">
</div>

</form>
</body>
</html>