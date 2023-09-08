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
	<h2>갤러리 게시판</h2>
	
	<ul>
		<c:forEach items="${list}" var="board">
			<li><c:out value="${board.title}"></c:out></li>
			<li><c:out value="${board.writer}"></c:out></li>
			<li><c:out value="${board.category}"></c:out></li>
		</c:forEach>
	</ul>
	<p><button onclick="location.href='/controller/galleryboard/register'">게시글 등록 페이지</button></p>
</body>
</html>