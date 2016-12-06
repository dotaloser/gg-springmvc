<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${title }</title>
</head>
<body>
<c:if test="${title == '用户列表' }">
<h1>Title is ${title }</h1>
</c:if>
<table>
	<thead>
	 <tr>
	     <th>序号</th>
	     <th>姓名</th>
	     <th>年龄</th>
	     <th>出生日期</th>
	     <th>电话</th>
	     <th>邮箱</th>
	 </tr>
	</thead>
	<tbody>
	  <c:forEach var="user" items="${userlist }" varStatus="status">
	  	<tr>
	  		<td>${status.index + 1}</td>
	  		<td>${user.name }</td>
	  		<td>${user.age }</td>
	  		<td><fmt:formatDate type="date" value="${user.birthday }" /></td>
	  		<td>${user.phone }</td>
	  		<td>${user.email }</td>
	  	</tr>
	  </c:forEach>
	</tbody>
</table>
</body>
</html>