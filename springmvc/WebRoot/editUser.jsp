<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="userForm" action="/springmvc/user/updateUser" method="post">
	<input type="hidden" name="id" value="${user.id}">
	<table border="1" width="50%" align="center">
		<tr>
			<td>姓名:</td>
			<td>
				<input type="text" name="userName" value="${user.userName}">
			</td>
		</tr>
		<tr>
			<td>年龄:</td>
			<td>
				<input type="text" name="age" value="${user.age}">
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="submit" value="修改">
			</td>
		</tr>
	</table>
</form>
</body>
</html>