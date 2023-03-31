<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공동구매물건(세션 연습)</title>
</head>
<body>
<% if(session.getAttribute("id") != null ) {  %>

<b style = "color:blue">${id}</b>님 로그인 중 <br><hr>

<%} else {} %>

<h3>공동구매할 물건 : 오렌지 </h3> 
<img src="resources/img/2.png" ><br>

<% if(session.getAttribute("id") != null ) {  %>

<br>
<a href="bbb"><button style="background:black; color:white">공동구매 참여</button></a><br>
	<a href="login.jsp"><button>메인으로</button></a>

<%} else { %>
<br>
공구 권한이 없습니다 <br>
	<a href="login.jsp"><button>로그인 페이지로</button></a>

<%} %>

</body>
</html>