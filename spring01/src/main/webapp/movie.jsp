<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 장르 선택</title>
</head>
<body>
<h3>영화 장르 선택 화면입니다.</h3>
<hr>
<form action="movie" method="get">
영화 장르 :<input name= "movie" value="드라마"><br>
<button type="submit" style="background:blue; color:white;">서버 전송</button>
</form>
</body>
</html>