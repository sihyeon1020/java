<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 테스트(list)</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		
		//1) ajax_test.jsp 시작하자마자 bbs.list를 result에 넣어주세요!
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
		
		
		$('#b1').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "list6",
				data: {
					bbsno : 2
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "list6",
				data: {
					bbsno : 8
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "one5",
				data: {
					id : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b4
		
		$('#b5').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "one6",
				data: {
					no : 2
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b5

		//bbs리스트 수정하기
		$('#b7').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "update2.multi",
				data:{
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function() {
					alert("수정 성공!");
					 document.location.reload();
				} //success
			}) //ajax
		})//b7
		
		$('#b8').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "delete2.multi",
				data:{
					no : $('#no').val()
				},
				success : function(x) {
					location.href="ajax_test.jsp"
				} //success
			}) //ajax
		})//b8
		
	})//$
</script>
</head>
<body>
<button id="b1">bbs 리스트 가지고 오기</button>
<button id="b2">bbs 번호 2번 reply 리스트 가지고 오기</button>
<button id="b3">bbs 번호 8번 reply 리스트 가지고 오기</button> <!-- list6, bbsno: 30 -->
<button id="b4">member id가 apple인 사람의 정보 가지고 오기</button> <!-- one5, id:apple, views/one5.jsp -->
<button id="b5">bbs no가 2인 게시물의 상세 정보 가지고 오기</button> <!-- one6, no: 2, views/one6.jsp -->
<button id="b6">member의 모든 리스트 가지고 오기</button><!-- list7, views/list7.jsp -->
<hr>
no : <input id="no">  content: <input id="content">
<button id ="b7">수정하기</button>
<button id="b8">삭제하기</button>
<hr color="blue">
<div id="result" style="background: yellow">

</div>
</body>
</html>