<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ include file="../includes/header.jsp" %>
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
                <!-- Begin Page Content -->
                <div class="container-fluid">
                <!-- 꾸미기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>수정하기</h2>
	<form method="post" class="modify" action="/board/modify">
		<table>
			<input type="hidden" name="bno" value="${board.bno}" />
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" value="${board.title}" required/> </td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" required value="${board.writer}"/> </td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="" cols="" name="content" required >
					${board.content}
					</textarea> 
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">등록</button>
					<button type="reset">취소</button>
				</td>
			</tr>
			<!-- 수정하기가 post로 되어 있어서 수정 완료후 원래 있던 페이지로 넘길 수 가 없어 추가  -->
			<input type="hidden" name="pageNum" value="${cri.pageNum}"/>
			<input type="hidden" name="amount" value="${cri.amount}"/>
			<input type="hidden" name="type" value="${cri.type}"/>
			<input type="hidden" name="keyword" value="${cri.keyword}"/>
		</table>
	</form>
			<!-- 첨부파일 이미지 영역 -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						파일들
					</div>
					<div class="paner-body">
					<!--   -->
						<div class="uploadDiv">
							<input type="file" name="uploadfile" multiple />
						</div>
						<!--  -->
						<div class="uploadResult">
							<ul></ul>
						</div>
						</div>
					</div>
				</div>
			</div>
		</div>
					<!-- 첨부파일 이미지 영역 끝 -->
					
					
	<!-- 꾸미기  -->
	</div>
	</div>
	<!--  사진 보이기 -->
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
						str += "<button class='btn' data-type='image' data-file='"+fileCallpath+"'>삭제</button>"
						str += "</div></li>"

					})
						$(".uploadResult ul").html(str);
					})	//end getJSON
			})();
			//삭제 버튼 클릭시 화면상에서 사라지도록 하기 
			$(".uploadResult").on("click","button",function(){
				console.log("delete file");
				if(confirm("파일을 삭제 하시겠습니까?")){
					let targetLi = $(this).closest("li");
					targetLi.remove();
				}
			})
				//요소의 변경이 있으면 콜백함수 실행
			$("input[type='file']").change(function() {
				//가상의 폼을 생성(폼태그)
				let formData = new FormData();
				let inputFile = $("input[name='uploadfile']")
				let files = inputFile[0].files;
				for(let i=0; i<files.length; i++){
					formData.append("uploadFile", files[i]);
				}
				$.ajax({
					url: '/uploadAjaxAction',
					processData: false,
					contentType: false,
					data: formData,
					type: 'POST',
					dataType: 'json',
					success : function (result) {
						console.log(result);
						showUploadResult(result);
					}
				})
			})
			function showUploadResult(uploadResultArr) {
				//결과 배열이 null이거나 길이가 0이면 함수 종료
				if(!uploadResultArr || uploadResultArr.length==0 ){return;}
				let uploadul = $(".uploadResult ul");
				let str = "";
				$(uploadResultArr).each(function(i, obj){
					console.log(obj);
					let fileCallpath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
					console.log(fileCallpath);
					str += "<li data-path='"+obj.uploadPath+"' data-filename='"+obj.fileName+"'"
					+"data-uuid='"+obj.uuid+"' data-type='"+obj.image+"'>"
					+"<img src='/display?fileName="+fileCallpath+"'/>"
					+"<button class='btn' data-file=\'"+fileCallpath+"\' data-type='image'>"
					+"삭제</button>"
					+"</li>"
				})
				uploadul.append(str);
			}
			//전송 버튼 누를때 파일 관련 데이터도 같이 전송 
			$("button[type='submit']").on("click",function(e){
				//연결된 이벤트 제거 (submit전송 제거)
				e.preventDefault();
				//폼선택 formObj할당
				let formObj = $("form.modify")
				console.log("submmit클릭");
				let str = "";
				$(".uploadResult ul li").each(function(i, obj){
					let jobj = $(obj);
					str += "<input type='hidden' name='attachList["+i+"].fileName' value='"+jobj.data("filename")+"'/>"
					str += "<input type='hidden' name='attachList["+i+"].uuid' value='"+jobj.data("uuid")+"'/>"
					str += "<input type='hidden' name='attachList["+i+"].uploadPath' value='"+jobj.data("path")+"'/>"
					str += "<input type='hidden' name='attachList["+i+"].fileType' value='"+jobj.data("type")+"'/>"
				})
				//폼에 데이터 추가 append()메소드 submit()전송하기 
				formObj.append(str).submit();
			})
		})
		//사진 보이기
		</script>
	<%@ include file="../includes/footer.jsp" %>