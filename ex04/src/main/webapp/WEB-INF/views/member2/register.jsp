<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>등록 페이지 입니다.</h2>
	<form method="post" action="/controller/member2/register">
		<p><input type="text" name="userid" placeholder="아이디" /></p>
		<p><input type="text" name="passwd" placeholder="비밀번호" /></p>
		<p><input type="text" name="birthyear" placeholder="생년월일" /></p>
		<p>
			<button>등록</button>
			<button>취소</button>
		</p>
	</form>
</body>
</html>