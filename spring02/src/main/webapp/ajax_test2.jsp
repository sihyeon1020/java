<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 테스트2 (list, one)</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		
		$('#b1').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "list7",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty() // 클릭할 때 마다 기존의 것 삭제됨 
			$.ajax({
				url : "one7",
				data: {
					id : 105
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b2
		

	})//$
</script>
</head>
<body>
<button id="b1">product 리스트 가지고 오기</button>
<button id="b2">product 의 id가 105번인 것 가지고 오기</button>
<hr color="blue">
<div id="result">

</div>
</body>
</html>