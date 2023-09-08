<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 페이지 입니다.</h2>
 <form method="post" action="/member/memberwrite">
 	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 	<p> 아이디 : <input type="text" name="userid" /> </p>
 	<p> 비밀번호 : <input type="password" name="userpw" /> </p>
 	<p> 이름 : <input type="text" name="username" /> </p>
 	<p> 
 		회원등급 <select name="auth"> 
 			<option value="ROLE_USER" selected>일반 회원</option>
 			<option value="ROLE_MEMBER">관리자 회원</option>
 			<option value="ROLE_ADMIN">운영자 회원</option>
 	</select></p>
 	<p>
 		<button type="submit">등록</button>
 		<button type="reset">취소</button>
 	</p>
 	
 
 </form>

</body>
</html>