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

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Tables</h1>
                    <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                        For more information about DataTables, please visit the <a target="_blank"
                            href="https://datatables.net">official DataTables documentation</a>.</p>
					<h2> 수정하기 페이지 </h2>
					<form class="galleryboard" method="post" action="/galleryboard/modify">
		                <div class="form-group row">
		                    <div class="col-sm-12 ">
		                    	<input type="hidden" name="gno" value="${board.gno}">
		                         <input type="text" class="form-control" id="exampleFirstName"
		                                           value="${board.title}"  name="title" required>
		                    </div>
		                    <div class="col-sm-12">
		                         <input type="text" class="form-control " id="exampleLastName"
		                                            value="${board.writer}" name="writer" required>
		                    </div>
		                    <div class="col-sm-12">
		                    	<select name="category">
		                    		<option value="all">종류</option>
		                    		<option value="cat">cat</option>
		                    		<option value="dog">dog</option>
		                    	</select>
		                    </div>
		                     <div>
		                   		<div class="panel panel-default">
										<div class="panel-heading">이미지 첨부</div>
									<div class="panel-body">
										<div class="uploadDiv">
											<input type="file" name="uploadfile" />
										</div>
										<div class="uploadResult">
										<!-- 그림 띄우기 추가 
										 -->
											<img src="/display?fileName=${board.fullName} " width="100"/>
										</div>
									</div>
								</div>
		                    </div>
		                    <div class="col-sm-12">
		                    	<textarea rows="" cols="" class="form-control " id="exampleLastName" 
		                    	name="content"  placeholder="내용"  required > ${board.content} </textarea> 
		                    </div>
		                    <div>
		                    	<button type="submit" class="btn btn-primary btn-user btn-user">등록</button>
								<button type="reset" class="btn btn-primary btn-user btn-user">취소</button>
		                    </div>
		                 </div>
		            </form>
				</div>
			</div>
			<script>
		//html문서를 다 로드하면 실행한다.
		$(document).ready(function() {
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
				//썸네일 이미지 뿌려주는 함수 
			function showUploadResult(uploadResultArr) {
				//결과 배열이 null이거나 길이가 0이면 함수 종료
				if(!uploadResultArr || uploadResultArr.length==0 ){return;}
				//ul 삭제
				let uploadul = $(".uploadResult");
				let str = "";
				$(uploadResultArr).each(function(i, obj){
					console.log(obj);
					let fileCallpath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
					let filePullpath = encodeURIComponent(obj.uploadPath+"\\"+obj.uuid+"_"+obj.fileName);
						//p 태그로 변경
					str += "<p data-path='"+obj.uploadPath+"' data-filename='"+obj.uuid+"_"+obj.fileName+"'"
					+" data-fullname='"+filePullpath+"'>"
					+"<img src='/display?fileName="+fileCallpath+"'/>"
						// 삭제 버튼 이였던 곳
					+"</p>";
				})
				uploadul.html(str);
				//uploadul.append(str); append는 추가 하는 부분이여서 html으로 바꿔줘야 한다.
			}
			//전송 버튼 클릭시 실행 
			//document.querySelector("button[type='submit']").addEventListener("click"function(){}) 이 밑에와 같이 생략 가능
			$("button[type='submit']").on("click",function(e){
				//연결된 이벤트 제거(submit 전송을 제거 한다.)
				e.preventDefault();
				//폼 선택
				let formObj = $("form.galleryboard");
				// .uploadResult안에 있는 p 태그를 선택 
				let imgp = $(".uploadResult p");
				let inputstr = "";
				// p태그를 이용해 값을 받아온다 커스텀 선택자
				inputstr += "<input type='hidden' name='fileName' value='"+imgp.data("filename")+"' />";
				inputstr += "<input type='hidden' name='fullName' value='"+imgp.data("fullname")+"' />";
				inputstr += "<input type='hidden' name='uploadPath' value='"+imgp.data("path")+"' />";
				formObj.append(inputstr).submit();
			})
		})
			
	</script>
<%@ include file="../includes/footer.jsp" %>