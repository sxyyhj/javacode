<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	function del(id){
		$.get("/springmvc/user/deleteUser?id="+id,function(data){
			if("success"==data.result){
				alert("删除成功!");
				window.location.reload();//刷新当前页面
			}else{
				alert("删除失败!");
			}
		});
	}
</script>
</head>
<body>
	<table border="1" width="50%" align="center">
		<tr align="center">
			<th>姓名</th>
			<th>年龄</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<c:if test="${!empty user }">
		<c:forEach items="${user}" var="u">
		<tr align="center">
			<td>${u.userName}</td>
			<td>${u.age}</td>
			<td><a href="/springmvc/user/getUser?id=${u.id}">编辑</a></td>
			<td><a href="javascript:del('${u.id}')">删除</a></td>
		</tr>
		</c:forEach>
		</c:if>
	</table>
</body>
</html>