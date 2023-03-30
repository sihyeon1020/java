<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북마크 페이지</title>
<style>
button{display:block; width:150px; height:40px; border-radius:50px; background: black; color:white; margin:10px 0 0 0; border: none;}
button:hover{background:gray;}
</style>
</head>
<body>

<a href="list3.multi">북마크 전체 검색하기</a>

<h3>북마크를 추가해주세요.</h3>
<hr>
<form action="insert3.multi" method="get">
name : <input name ="name" value="naver"><br>
url : <input name ="url" value="http://www.naver.com"><br>
img : <input name ="img" value="naver.png"><br>
<button type="submit">북마크 추가하기</button>
</form>

<hr color="blue">
<h3>북마크를 삭제해주세요.</h3>
<hr>
<form action="delete3.multi" method="get">
id : <input name ="name" value="14"><br>
<button type="submit">북마크 삭제하기</button>
</form>

<hr color="blue">
<h3>북마크를 수정해주세요.</h3>
<hr>
<form action="update3.multi" method="get">
id : <input name ="id" value="1"><br>
url : <input name ="url" value="http://www.naver.com22"><br>
<button type="submit">북마크 수정하기</button>
</form>

<hr color="blue">
<h3>북마크를 검색해주세요.</h3>
<hr>
<form action="one3.multi" method="get">
id : <input name ="id" value="1"><br>
<button type="submit">북마크 검색하기</button>
</form>
</body>
</html>