<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="../includes/header.jsp" %>
<style>
	.bigPictureWrapper{
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 100vh;
		background: rgba(0,0,0,0.5);
		display: none;
		justify-content: center;
		align-items: center;
		color:#fff;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Tables</h1>
                    <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                        For more information about DataTables, please visit the <a target="_blank"
                            href="https://datatables.net">official DataTables documentation</a>.</p>
	<!--  <h1>조회 페이지</h1>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>수정일</td>
		</tr>-->
		<!-- table 형식에서 P태그로 바꿨다 -->
				<h2>조회 페이지</h2>
					<p><c:out value="${board.bno}"/></p>
					<p><c:out value="${board.title}"/></p>
					<p><c:out value="${board.writer}"/></p>
					<p><c:out value="${board.content}"/></p>
					<p><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}"/> </p>
					<p><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updatedate}"/> </p>
					<p>
						<!-- 목록으로 돌아 갈때 전의 페이지로 넘어가게 하기 위해 
						=${cri.pageNum}&amount=${cri.amount} 파라미터 추가  -->	<!--&type=${cri.type}&keyword=${cri.keyword} 목록 갈때 type과 keyword를 가지고 가게 한다. -->
						<button onclick="location.href='/board/list?pageNum=${cri.pageNum}&amount=${cri.amount}&type=${cri.type}&keyword=${cri.keyword}'">목록</button>
						
						<sec:authentication property="principal" var="pinfo"/>
						<!-- 로그인 한 사람만 보여주기 -->
						<sec:authorize access="isAuthenticated()">
						<!-- 로그인한 사용자와 글쓴이랑 같아야 한다. -->
						<c:if test="${pinfo.username eq board.writer }">
						<!-- get요청 방식이여서 컨트롤러에 get요청을 만들어 줘야 한다. -->	
						<button onclick="location.href='/board/modify?bno=${board.bno}&pageNum=${cri.pageNum}&amount=${cri.amount}&type=${cri.type}&keyword=${cri.keyword}'">수정</button>	
						<form method="post" action="/board/remove">
							 <!-- 토큰 전송 (post방식일때 sec 사용하려면 추가  ) -->
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
							 <input type="hidden" name="bno" value="${board.bno}">
							 <button>삭제</button>	 
						 </form>	
						 </c:if>
						 </sec:authorize>
					</p>
					<!-- 첨부파일 이미지 영역 -->
					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
								<div class="panel-heading">
									파일들
								</div>
								<div class="paner-body">
									<div class="uploadResult">
										<ul></ul>
									</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- 첨부파일 이미지 영역 끝 -->
		</div>
	</div>
	<div class="bigPictureWrapper">
		<div class="bigPicture">
		</div>
	
	</div>
	<script>
		$(document).ready(function () {
			//바로 실행 시키기 위한 function으로 ready됐을때 바로 실행 된다.
			//스스로 실행되는 함수
			(function() {
				let bno = '<c:out value="${board.bno}"/>';
				$.getJSON("/board/getAttachList", {bno:bno},
				function(arr) {
					console.log(arr);
					//이미지 나타내기
					let str="";
					$(arr).each(function(i, attach) {
						let fileCallpath = 
						encodeURIComponent(attach.uploadPath+"/s_"+attach.uuid+"_"+attach.fileName);
						str += "<li data-path='"+attach.uploadPath+"' data-uuid='"+attach.uuid+"'"
						str += "data-filename='"+attach.fileName+"' data-type='"+attach.fileType+"'>"
						str += "<div><img src='/display?fileName="+fileCallpath+"' />";
						str += "</div></li>"

					})
						$(".uploadResult ul").html(str);
					})	//end getJSON
			})();
			//li를 클릭하면 bigPictureWrapper나타나게 하고
			//.bigPicture의 html내용에 이미지가 나타나도록 지정 
			$(".uploadResult").on("click","li",function(e){
				console.log("view image");
				let liObj = $(this);
				let path = encodeURIComponent(liObj.data("path")+"/"
						+liObj.data("uuid")+"_"+liObj.data("filename"));
				showImage(path.replace(new RegExp(/\\/g),"/"))
			})
			function showImage(fileCallPath) {
				alert(fileCallPath);
				$(".bigPictureWrapper").css("display","flex");
				$(".bigPicture").html("<img src='/display?fileName="
						+fileCallPath+"' width='500'/><span>X</span>");
			}
			$(".bigPictureWrapper").on("click","span",function(e){
				$(".bigPictureWrapper").css("display","none");
			})
		})
	</script>
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>









