<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>생년</td>
		</tr>
		<c:forEach items="${list}" var="member">
			<tr>
				<td> <c:out value="${member.userid}"></c:out> </td>
				<td> <c:out value="${member.passwd}"></c:out> </td>
				<td> <c:out value="${member.birthyear}"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>