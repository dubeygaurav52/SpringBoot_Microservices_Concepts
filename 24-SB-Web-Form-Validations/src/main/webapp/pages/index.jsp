<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style >
.error{
color:red;
}
</style>
</head>
<body>
		<h1>User Form</h1>
<form:form action="saveUser" modelAttribute="user" method="POST">
	<table>
		<tr>
			<td>User Name</td>
			<td> <form:input path="uname"/> </td>
			<td> <form:errors path="uname" class="error"></form:errors> </td>
		</tr>
		<tr>
			<td>Password</td>
			<td> <form:input path="pwd"/> </td>
			<td> <form:errors path="pwd" class="error"></form:errors> </td>
		</tr>
		<tr>
			<td>Email</td>
			<td> <form:input path="email"/> </td>
			<td> <form:errors path="email" class="error"></form:errors> </td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td> <form:input path="phno"/> </td>
			<td> <form:errors path="phno" class="error"></form:errors> </td>
		</tr>
		<tr>
			<td></td>
			<td> <input type="submit" value="Save"> </td>
		</tr>
	</table>
	
</form:form>
</body>
</html>