<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식 정보 입력</title>
</head>
<body>
<h3>좋아하고/싫어하는 음식 입력해주세요.</h3>
<hr>
<form action="food" method="get">
좋아하는 음식 :  <input name= "like" value="라면"><br>
싫어하는 음식 : <input name= "dislike"  value="커피"><br>
<button type="submit" style="background:pink">정보 전송</button>
</form>
<hr color="red">

</body>
</html>