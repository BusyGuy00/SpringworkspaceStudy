<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ include file="../includes/header.jsp" %>
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
			<h2>갤러리 등록 페이지 입니다.</h2>
		
			<form class="user" method="post" action="/board/register">
				<!-- 토큰 전송 (post방식일때 sec 사용하려면 추가  ) -->
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
                <div class="form-group row">
                    <div class="col-sm-6 mb-3 mb-sm-0">
                         <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="제목"  name="title" required>
                    </div>
                    <div class="col-sm-6">
                         <input type="text" class="form-control form-control-user" id="exampleLastName"
                                            placeholder="글쓴이" name="writer"
                                            value='<sec:authentication property="principal.username"/>' readonly required/>
                    </div>
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
		</div>
		<!-- 새로 추가 되는 부분 -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">파일 첨부</div>
					<div class="panel-body">
						<div class="uploadDiv">
							<input type="file" name="uploadfile" multiple />
						</div>
						<div class="uploadResult">
							<ul></ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		//html문서를 다 로드하면 실행한다.
		$(document).ready(function() {
			//전송 버튼 누를때 파일 관련 데이터도 같이 전송 
			$("button[type='submit']").on("click",function(e){
				//연결된 이벤트 제거 (submit전송 제거)
				e.preventDefault();
				//폼선택 formObj할당
				let formObj = $("form.user")
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
			
			//요소의 변경이 있으면 콜백함수 실행
			$("input[type='file']").change(function() {
				//가상의 폼을 생성(폼태그)
				let formData = new FormData();
				let inputFile = $("input[name='uploadfile']")
				let files = inputFile[0].files;
				for(let i=0; i<files.length; i++){
					formData.append("uploadFile", files[i]);
				}
				let csrfHeaderName = "${_csrf.headerName}";
				let csrfTokenValue = "${_csrf.token}";
				$.ajax({
					url: '/uploadAjaxAction',
					processData: false,
					contentType: false,
					data: formData,
					beforeSend:function(xhr){
						xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
					},
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
			//삭제 버튼 추가하기 //"click","button",function 으로 버튼에만 이벤트를 줄 수있다.
			//or $(".uploadResult button")이라고 직접 지정해도 가능하다.
			$(".uploadResult").on("click","button",function (e) {
				console.log("삭제 클릭")
				//이벤트를 발생시키면 이벤트를 발생시킨 객체를 this가 가르킴 
				//커스텀 속성 dataset ---> data("키이름")
				//이렇게 함으로써 fileCallpath를 받아 온다.
				let targetFile = $(this).data("file");
				let type = $(this).data("type");
				//console.log($(this)) 어디서 작동하는지 확인 할 수있다.
				//사용하고 있는 this의 가까운 li를 찾는다. 
				let targetLi = $(this).closest("li")
				let csrfHeaderName = "${_csrf.headerName}";
				let csrfTokenValue = "${_csrf.token}";
				$.ajax({
					url: '/deleteFile',
					data: {fileName : targetFile, type: type},
					dataType : 'text',
					beforeSend:function(xhr){
						xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
					},
					type: 'POST',
					success: function(result) {
						alert(result)
					}
				})
				//찾은 targetLi를 기능이 다 수행한 후에 삭제 한다.
				targetLi.remove();
			})
			
		})
		
	</script>
	
	
	<%@ include file="../includes/footer.jsp" %>
	
	
	
	
	
	
	
	
	
	
	
	