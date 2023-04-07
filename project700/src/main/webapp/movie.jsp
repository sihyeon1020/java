<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 project</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h3>검색 화면입니다.</h3>
<a href="list">모든 영화 리스트</a>

<hr>
<form action="one" method="get">
id : <input name= "id" value="1"><br>
<button type="submit" style="background:pink">영화 검색</button>
</form>

<hr color="red">

<h3>영화 추가</h3>
<hr>
<form action="insert" method="get">
title : <input name= "title" value="장고"><br>
genre : <input name= "genre"  value="액션"><br>
grade : <input name= "grade"  value="6"><br>
director : <input name= "director"  value="김"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="black">

<h3>영화 수정</h3>
<hr>
<form action="update" method="get">
id : <input name= "id" value="6"><br>
grade : <input name= "grade"  value="7.48"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="black">

<h3>영화 삭제</h3>
<hr>
<form action="delete" method="get">
id : <input name= "id" value="6"><br>
<button type="submit">서버로 전송</button>
</form>

</body>
</html>