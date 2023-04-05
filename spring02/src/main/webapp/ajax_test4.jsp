<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>json 테스트4 (member)</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url: "one55",
				dataType : "json",
				data:{
					id: "apple"
				},
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					$('#result').append("<table border='1' width='300px'><tr><td>아이디</td><td>"+ id + "</td></tr><tr><td>패스워드</td><td>" + pw + "</td></tr><tr><td>이름</td><td>" + name + "</td></tr><tr><td>전화번호</td><td>" + tel + "</td></tr></table>")
				} //success
			}) //ajax
		})//b1
		
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "list555",
				dataType : "json",
				success: function(json) {
					id = json[0].id
					pw = json[0].pw
					name = json[0].name
					tel = json[0].tel
					
					id1 = json[1].id
					pw1 = json[1].pw
					name1 = json[1].name
					tel1 = json[1].tel
					
					id2 = json[2].id
					pw2 = json[2].pw
					name2 = json[2].name
					tel2 = json[2].tel
				$('#result').append(id + " " + pw + " " + name + " " + tel + "<br>")
				$('#result').append(id1 + " " + pw1 + " " + name1 + " " + tel1 + "<br>")
				$('#result').append(id2 + " " + pw2 + " " + name2 + " " + tel2 + "<br>")
				} //success
			}) //ajax
		})//b2
		
		
		$('#b22').click(function() {
			$('#result').empty()
			$.ajax({
				url: "list555",
				dataType : "json",
				success: function(json) {
					id = json[0].id
					pw = json[0].pw
					name = json[0].name
					tel = json[0].tel
					
					id1 = json[1].id
					pw1 = json[1].pw
					name1 = json[1].name
					tel1 = json[1].tel
					
					id2 = json[2].id
					pw2 = json[2].pw
					name2 = json[2].name
					tel2 = json[2].tel
				$('#result').append("<table border='1' width='300px'><tr><td>아이디</td><td>패스워드</td><td>이름</td><td>전화번호</td></tr>"+
						"<tr><td>" + id + "</td><td>" + pw + "</td><td>"  + name + "</td><td>" + tel + "</td></tr>"+
						"<tr><td>" + id1 + "</td><td>" + pw1 + "</td><td>"  + name1 + "</td><td>" + tel1 + "</td></tr>"+
						"<tr><td>" + id2 + "</td><td>" + pw2 + "</td><td>"  + name2 + "</td><td>" + tel2 + "</td></tr></table>")
				} //success
			}) //ajax
		})//b2
		
	
	})//$
</script>
</head>
<body>
<button id="b1">컨트롤러에서 member을 받아오자!</button>
<button id="b2">컨트롤러에서 member 리스트를 받아오자!</button>
<button id="b22">컨트롤러에서 member 리스트(테이블)를 받아오자!</button>
<hr color="blue">
<div id="result">

</div>
</body>
</html>