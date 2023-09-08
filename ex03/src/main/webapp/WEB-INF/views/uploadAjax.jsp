<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	<!-- 이미지 출력 부분 -->
	<div class="uploadResult">
		<ul>
		</ul>
	</div>
	<button id="uploadBtn">업로드</button>
	<script>
		//제이쿼리의 시작 하는 함수 document(파일이)가 준비되면 function이 실행 된다.
		$(document).ready(function() {
			//버튼 클릭할때 실행 해라 
			
			//input 초기화를 위한 복사 (input이 있는 div를 복사)
			let cloneobj = $(".uploadDiv").clone();
			
			//등록한 이미지 나타내기
			//uploadResult클래스 안에 있는 ul태그 객체로 할당
			let uploadResult = $(".uploadResult ul");
			function showUploadFile(uploadResultArr) {
				let str = "";
				$(uploadResultArr).each(function(i, obj){
					//str += "<li>"+obj.fileName+"</li>";
					//썸 네일로 지정한 이미지를 가져오기 위해 "/s_" 붙였다. 
					let fileCallpath = encodeURIComponent(obj.uploadPath+"/s_"+obj.fileName);
					str += "<li><img src='/display?fileName="+fileCallpath+"'/>"
					+"<span data-file=\'"+fileCallpath+"\' data-type='image'>X</span>"
					+"</li>"
				})
				uploadResult.append(str);
			}
			
			//정규 표현식 = 확장자 검사 exe,sh,zip,alz은 업로드 불가 
			let regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
			let maxSize = 52428880; // 5mb지정
			function checkExtension(fileName, fileSize) {
				if(fileSize >= maxSize){
					alert("파일 사이즈 초과");
					return false;
				}
				if(regex.test(fileName)){
					alert("해당 종류의 파일은 업로드 할 수 없습니다.");
					return false;
				}
				return true;
			}
		//	$(".imgDeleteBtn").click(function(){
			//	consol.log("클릭")
		//		deleteFile();
			//})
			
			//파일 삭제 메소드 
			
			//function deleteFile() {
			//	let targetFile = $(".imgDeleteBtn").data("file");
			//	let targetDiv = $("#result_card");
		///	$.ajax({
			//	url: '/deleteFile',
			//	data: {fileName: targetFile, type:targetType},
				//dataType: "text",
			//	type : 'POST'
			//	success: function (result) {
				//	alert(result)
			//	},
			//	error : function (result) {
			//		console.log(result);
			//	}
			//});
			//}
		
		// 파일 삭제 "X"표시에 대한 이벤트 처리 
			$(".uploadResult").on("click","span",function(e){
				let targetFile = $(this).data("file");
				let type = $(this).data("type");
				console.log(targetFile)
				$.ajax({
					url:'/deleteFile', // 요청경로
					data: {fileName: targetFile, type: type}, //전송데이터 
					dataType: 'text', // 응답데이터 타입 
					type:'POST', //전송 메소드 타입 
					success: function (result) { //전송 성공시 실행
						alert(result);
					}
				})
			})
				
		
		
			//document.querySelector("#uploadBtn").addEventListener("click",function(){}) 과 같은 효과 이다. (자바스크립트)
			//제이쿼리방식
			$("#uploadBtn").on("click",function(){
				//가상의 폼 태그 생성을 했다 FormData에 필요한 파라미터를 담에서 전송할것이다.
				let formData = new FormData();
				//css에서 선택자 활용이다. input에 있는 uploadFile을 지정 해주는 것이다
				let inputFile = $("input[name='uploadFile']");
				
				
				let files = inputFile[0].files;
				console.log(files);
				for(var i=0; i<files.length; i++) {
					if(!checkExtension(files[i].name, files[i].size)) {
						return false;
					}
					formData.append("uploadFile", files[i]);
				}
				formData.append("uploadFile", files[i]);
				  //전송하기 ==> 페이지는 그대로 있는 상태에서 요청하기!
				$.ajax({
					url: '/uploadAjaxAction',
					data: formData,
					type: 'POST',
					processData: false,
					contentType: false,
					dataType : 'json',
					success: function(result){
						//alert("uploaded")
						console.log(result);
						showUploadFile(result);
						$(".uploadDiv").html(cloneobj.html());
					}	
				});
			})
		})
	</script>
</body>
</html>














