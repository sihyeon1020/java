<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json 스프링 구조 연습2 & list</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때
		//입력값으로 넣은 함수를 실행해주세요.
		$('#b1').click(function() {
			$.ajax({
				url : "movie",
				data : {
					name : $('#name').val(),
					price : $('#price').val()
				},
				success : function(ok) {
					alert('영화 요청 성공!')
					$('#result').append(ok + "<br>")
				},
				error : function() {
					alert('영화 요청 실패!')
				}
			})
		})

		//과일목록
		$('#b2').click(function() {
			$.ajax({
				url : "fruit",
				success : function(ok) {
					alert('과일 리스트 요청 성공!')
					$('#result').append(ok + "<br>")
				}
			})
		})

		//여행목록
		$('#b3').click(function() {
			$.ajax({
				url : "tour",
				success : function(ok) {
					alert('여행 리스트 요청 성공!')
					$('#result').append(ok + "<br>")
				}
			})
		})

	})
</script>
</head>
<body>
	영화 제목:
	<input id="name" value="슬램덩크">
	<br> 영화 관람료:
	<input id="price" value="14000">
	<br>
	<input id="b1" type="button" value="영화 관람 확인">
	<br>
	<!-- 버튼 태그랑 동일함 -->
	<hr>
	<input id="b2" type="button" value="과일 목록을 가지고 오자.">
	<br>
	<input id="b3" type="button" value="여행 목록을 가지고 오자.">
	<br>
	<hr color="blue">
	<div id="result"></div>
</body>
</html>