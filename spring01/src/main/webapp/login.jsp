<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 분리</title>
</head>
<body>
<% if(session.getAttribute("id") == null ) { %>
<h3>로그인 화면입니다.</h3>
<hr>
<form action="login" method="get">
id : <input name= "id" value="apple"><br>
pw : <input name= "pw"  value="1234"><br>
<button type="submit" style="background:blue; color:white;">로그인</button>
</form>
<%} else { %>
<hr color="red">
${id}님이 로그인 중입니다~<br>
<a href="bbs.jsp">
	<button style="background:black; color:white;">게시판으로</button>
</a>
<%} %>
<hr>
<a href="news.jsp">
	<button style="background:pink; ">뉴스사이트로</button>
</a>
<a href="cafe.jsp">
	<button style="background:orange;">카페사이트로</button>
</a>

</body>
</html>