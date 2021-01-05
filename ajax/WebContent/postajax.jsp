<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.5.1.js"
  integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
  crossorigin="anonymous"></script>
</head>
<body>
<button onclick="postajax()">클릭</button>

<script>

	function postajax(){
	 	// POST으로 key=value 데이터를 전송하고 응답을 json으로 받아보기
	 	
		$.ajax({
			type: "POST",
			url: "http://localhost:8000/ajax/ajax1",
			data: "username=ssar&password=1234",
			contentType: "application/x-www-form-urlencoded"
			//dataType: "json" 
		})
		.done(function(result){
			console.log(result);
			console.log(result.username);
		}) // ajax 통신 완료후에 정상이면 done이 가지고 있는 함수 호출
	}
	


</script>
</body>
</html>