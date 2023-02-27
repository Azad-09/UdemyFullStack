<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<%@ page import="org.easy.entity.User"%>
<c:import url="include/header.jsp">
	<c:param name="title" value="ListUsers"></c:param>
</c:import>
<div class="container mtb">
	<div class="row bg-info">
		<div class="col-lg-6 bg-warning">
			<h1 class="ml-2">Listing User</h1>
			<br>
			<table border="1">
				<thead>
					<th>User ID</th>
					<th>User Name</th>
					<th>Email</th>
					<th>Operation</th>
				</thead>
				<c:forEach items="${listUsers}" var="user">
					
				<c:url var="updateURL" value="operation">
						<c:param name="page" value="updateUser" ></c:param>
						<c:param name="usersId" value="${user.user_id}" ></c:param>
						<c:param name="username" value="${user.usr_name}" ></c:param>
						<c:param name="email" value="${user.email}" ></c:param>
				</c:url>
				
					
				<c:url var="deleteURL" value="operation">
						<c:param name="page" value="deleteUser" ></c:param>
						<c:param name="usersId" value="${user.user_id }" ></c:param>
				</c:url>

				<tr>
					<td>${user.user_id}</td>
					<td>${user.usr_name}</td>
					<td>${user.email}</td>
					<td><a href="${updateURL}">Update</a> | <a
						href="${deleteURL}"
						onclick="if(!confirm('Are you sure to delete the user?')) return false">Delete</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
<c:import url="include/footer.jsp"></c:import>