<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<table>
		<tr>
			<td>
				이름
			</td>
			<td>
				생년월일
			</td>
			<td>
				아이디
			</td>
			<td>
				비밀번호
			</td>
			<td>
				주소
			</td>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
					<td>
						<c:out value="${board.name}"></c:out>
					</td>
					<td>
					<fmt:parseDate value="${board.day}" var="day" pattern = "yyyy-MM-dd" />
					<fmt:formatDate value="${day}" pattern = "yyyy년 MM월 dd일"/>
					</td>
					<td>
						<p><c:out value="${board.id}"></c:out> </p>
					</td>
					<td>
						<p><c:out value="${board.pass}"></c:out> </p>
					</td>
					<td>
						<p><c:out value="${board.address}"></c:out> </p>
					</td>
	
			</tr>
		</c:forEach>
	</table>
	<p><button onclick="location.href='/controller/member/register'">회원 가입</button></p>
</div>
</body>
</html>