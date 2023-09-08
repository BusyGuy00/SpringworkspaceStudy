<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<form class="galleryboard" method="post" action="/controller/galleryboard/register">
                <div >
                    <div class="col-sm-12 ">
                         <input type="text"  placeholder="제목"  name="title" required>
                    </div>
                    <div class="col-sm-12">
                         <input type="text"  placeholder="글쓴이" name="writer" required>
                    </div>
                    <div class="col-sm-12">
                    	<select name="category">
                    		<option value="all">종류</option>
                    		<option value="cat">cat</option>
                    		<option value="dog">dog</option>
                    	</select>
                    </div>
                     <div>
                   		<div>
								<div>파일 첨부</div>
							<div>
								<div>
									<input type="file" name="uploadfile" />
								</div>
								<div class="uploadResult">
									<ul></ul>
								</div>
							</div>
						</div>
                    </div>
                    <div class="col-sm-12">
                    	<textarea rows="" cols="" 
                    	name="content" placeholder="내용"  required > </textarea> 
                    </div>
                    <div>
                    	<button type="submit" >등록</button>
						<button type="reset" >취소</button>
                    </div>
                 </div>
            </form>
           <script>
		//html문서를 다 로드하면 실행한다.
		$(document).ready(function() {
			//전송 버튼 누를때 파일 관련 데이터도 같이 전송 
			$("button[type='submit']").on("click",function(e){
				//연결된 이벤트 제거 (submit전송 제거)
				e.preventDefault();
				//폼선택 formObj할당
				let formObj = $("form.galleryboard");
				console.log("submmit클릭");
				let str = "";
				let li = $(".uploadResult ul li");
					str += "<input type='hidden' name='fileName' value='"+li.data("filename")+"'/>"
					str += "<input type='hidden' name='uploadPath' value='"+li.data("path")+"'/>"
					str += "<input type='hidden' name='fullName' value='"+li.data("fullname")+"'/>"
			
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
				$.ajax({
					url: '/controller/uploadAjaxAction',
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
				let uploadul = $(".uploadResult ul");
				let str = "";
				$(uploadResultArr).each(function(i, obj){
					console.log(obj);
					let fileCallpath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
					let filePullpath = encodeURIComponent(obj.uploadPath+"\\"+obj.uuid+"_"+obj.fileName);
					str += "<li data-path='"+obj.uploadPath+"' data-filename='"+obj.uuid+"_"+obj.fileName+"'"
					+" data-fullname='"+filePullpath+"'>"
					+"<img src='/controller/display?fileName="+fileCallpath+"'/>"
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
				
				$.ajax({
					url: '/deleteFile',
					data: {fileName : targetFile, type: type},
					dataType : 'text',
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
</body>
</html>