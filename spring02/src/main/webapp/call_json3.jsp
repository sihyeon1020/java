<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨트롤러에서 json 받기(db값)</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url: "one22",
				data:{
					no : 7
				},
				dataType : "json",
				success: function(json) {
					no = json.no
					content = json.content
					$('#result').append(no + " " + content + "<br>")
				} //success
			}) //ajax
		})//b1
	
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "list55",
				dataType : "json",
				success: function(json) {
					no1 = json[1].no
					content1 = json[1].content
					$('#result').append("json배열 중 2번째 것 >> "+ no1 + " " + content1)
				} //success
			}) //ajax
		})//b11
	
		$('#b111').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출 
					$('#result').append("<b style='background:skyblue'>아이디: " + id + "</b><br><b style='background:yellow'>패스워드: " + pw + "</b><br><b style='background:pink'>이름: " + name + "</b><br><b style='background:lime'>전화번호: " + tel + "</b><br>")
				} //success
			}) //ajax
		})//b111
		
	
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json3",
				dataType : "json",
				success: function(json) {
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer
					$('#result').append(no + " " +title + " " + content + " " + writer + "<br>")
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json4",
				dataType : "json",
				success: function(json) {
					no = json[0].no
					title = json[0].title
					content = json[0].content
					writer = json[0].writer

					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					writer2 = json[1].writer
					$('#result').append(no + " " +title + " " + content + " " + writer + "<br>")
					$('#result').append(no2 + " " +title2 + " " + content2 + " " + writer2 + "<br>")
				} //success
			}) //ajax
		})//b4

	})//$
</script>

</head>
<body>
<button id="b1">컨트롤러에서 bbs JSON(text)을 받아오자!</button>
<button id="b11">컨트롤러에서 bbs JSON(table)을 받아오자!</button>
<button id="b2">컨트롤러에서  bbs JSONArray를 받아오자!</button>
<hr>
<button id="b3">컨트롤러에서 JSON3을 받아오자!</button> <!-- url : json3, bbs vo에 값을 하나 넣어서 json으로 받아와서 출력  -->
<button id="b4">컨트롤러에서 JSONArray4를 받아오자!</button> <!-- url: json4, bbs vo 2개가 들어간 arraylist를 만들어서 jsonarray로 받아와서 출력 -->
<hr color="red">
<div id="result"></div>
</body>
</html>