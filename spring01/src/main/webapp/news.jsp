<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스댓글(세션 연습)</title>
</head>
<body>
<% if(session.getAttribute("id") != null ) {  %>

<b style = "color:blue">${id}</b>님 로그인 중 <br><hr>

<%} else {} %>

<h3>손예진♥현빈, 결혼 1주년 자축</h3> 
<img src="resources/img/news.jpg" width="400" height="auto"><br>

<% if(session.getAttribute("id") != null ) {  %>

	<form action="aaa">
	댓글 : <input name="reply"><button>댓글달기</button>
	</form><br>
		<a href="login.jsp"><button>메인으로</button></a>
		
<%} else { %>

댓글 권한이 없습니다. <br>
	<a href="login.jsp"><button>로그인 페이지로</button></a>
	
<% } %>
	
</body>
</html>