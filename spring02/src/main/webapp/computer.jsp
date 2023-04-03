<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json 스프링 구조 연습</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function(){ //body부분이 dom tree로 메모리에 준비가 되었을 때
		//입력값으로 넣은 함수를 실행해주세요.
		$('#b2').click(function() {
			$.ajax({
				url: "computer",
				data: {
					com: $('#com').val(),
					price:  $('#price1').val(),
					mouse: $('#mouse').val(),
					price2: $('#price2').val() 
					},
					success: function(ok) {
						//alert('컴퓨터 요청 성공!')
						//alert(ok)
							$('#result').append(ok + "<br>")
					},
					error: function() {
						alert('컴퓨터 요청 실패!')
				}
			})	
		})
	})

</script>
</head>
<body>
	컴퓨터 종류: <input id="com" value="맥"><br>
	컴퓨터 가격: <input id="price1"  value="20000"><br>
	마우스 종류: <input id="mouse" value="로지텍"><br>
	마우스 가격: <input id="price2" value="10000"><br>
	<input id="b2" type="button"  value="컴퓨터 구매 항목 확인"><br>  <!-- 버튼 태그랑 동일함 -->
	<hr>
	<div id="result"></div>
</body>
</html>