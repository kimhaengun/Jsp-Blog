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
<button onclick="jsonajax()">클릭</button>

<script>
	var data = {
		username: "ssar",
		password: "1234"
	}

	// JSON.stringify() => 자바스크립트 오브젝트를 JSON으로 변경
	// JSON.parse() => JSON을 자바스크립트 오브젝트로 변경
	// console.log(data);
	// var jsonData = JSON.stringify(data);
	// console.log(jsonData);
	
	function jsonajax(){
		$.ajax({
			type: "POST",
			url: "http://localhost:8000/ajax/ajax2",
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json" 
		})
		.done(function(result){
			console.log(result);
			console.log(result.username);
		}) // ajax 통신 완료후에 정상이면 done이 가지고 있는 함수 호출
	}
	


</script>
</body>
</html>