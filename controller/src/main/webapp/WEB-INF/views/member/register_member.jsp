<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form class="member" method="post" action="/member/register_member">
<!-- 토큰 전송 (post방식일때 sec 사용하려면 추가  ) -->
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
                <div class="form-group row">
                    <div class="col-sm-6 mb-3 mb-sm-0">
                         <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="이름"  name="name" required>
                    </div>
                    <div class="col-sm-6 mb-3 mb-sm-0">
                         <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="아이디"  name="id" required>
                    </div>
                    <div class="col-sm-6 mb-3 mb-sm-0">
                         <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="이름"  name="name" required>
                    </div>
                    
                    <sec:authorize access="isAuthenticated()">
				    <input type="text" class="form-control form-control-user" id="exampleLastName"
				        placeholder="글쓴이" name="writer"
				        value='<sec:authentication property="principal.username"/>' readonly required/>
					</sec:authorize>
                    <div class="col-sm-12">
                    	<textarea rows="" cols="" class="form-control form-control-user" id="exampleLastName" 
                    	name="content" required > 내용 </textarea> 
                    </div>
                    <div>
                    	<button type="submit" class="btn btn-primary btn-user btn-user">등록</button>
						<button type="reset" class="btn btn-primary btn-user btn-user">취소</button>
                    </div>
                 </div>

</form>

</body>
</html>