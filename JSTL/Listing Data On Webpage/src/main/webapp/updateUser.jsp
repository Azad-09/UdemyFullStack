<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:import url="include/header.jsp"><c:param name="title" value="Update User"></c:param></c:import>
<div class="container mtb">
	<div class="row bg-info">
		<div class="col-lg-6 bg-warning">
			<h2 class="ml-2">Update User</h2>
			<form action="${pageContext.request.contextPath}/operation" method="post">
				User name:&nbsp;&nbsp;  <input type="text" value="${param.username}" name="username" required="required" /> <br><br>
				Email:&nbsp;&nbsp;&nbsp; <input type="email" value="${param.email}" name="email" required="required"/> <br><br>
				<input type="hidden" name="usersId" value="${param.usersId}">
				<input type="hidden" name="form" value="updateUserOperation">
				<input class="btn btn-success" type="submit"  name="btn" value="Update ">
			</form>
		</div>
	</div>
</div>
<c:import url="include/footer.jsp"></c:import>