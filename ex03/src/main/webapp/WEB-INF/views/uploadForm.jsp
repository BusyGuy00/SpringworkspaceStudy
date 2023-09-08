<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadFormAction" method="post"
		enctype="multipart/form-data">
		<!-- 한번에 파일을 여러개를 등록하기 속성 multiple -->
		<input type="file" name="uploadFile" multiple>
		<button>등록</button>
	</form>
</body>
</html>