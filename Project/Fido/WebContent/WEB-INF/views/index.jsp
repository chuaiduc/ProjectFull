<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Manager</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="text-center">

		<h3 class="py-3">User Management Spring MVC, JSTL, JPA CRUD, Online MySQL, Hibernate</h3>
		<!-- <form method="get" action="search">
			<input type="text" name="keyword" /> <input type="submit"
				value="Search" />
		</form> -->
		<table class="table table-bordered table-striped table-hover" style="width: 90%; margin: auto">
			<tr style="background-color: darkgreen; color:yellow">
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Username</th>
			<th>Password</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Birthday</th>
			<th>Type</th>
			</tr>
			<c:forEach items="${listUser}" var="user">
			<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.address}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.phone}</td>
			<td>${user.email}</td>
			<td>${user.gender}</td>
			<td>${user.birthday}</td>
			<td>${user.idStaffType}</td>
			</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>