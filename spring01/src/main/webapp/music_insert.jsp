<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 검색 페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
.btn2{display:block; width:150px; height:40px; border-radius:50px; background: black; color:white; margin:10px 0 0 0; border: none;}
.btn2:hover{background:gray;}
.btn3{display:block; width:130px; height:30px; border-radius:50px; background: black; color:white; margin:10px 0 0 0; border: none;}
.btn3:hover{background:gray;}
button{margin:10px; }
</style>
</head>
<body>

<div  class="container pt-5">
<h3>노래 추가하기</h3>
<hr>
<form action="insert4.multi" method="get">
<table  class="table table-striped">

<tr>
	<td><b>노래 번호</b><td>
	<td><input name ="id" value="8"></td>
</tr>
<tr>
	<td><b>노래 이름</b><td>
	<td> <input name ="name" value="ELEVEN"></td>
</tr>
<tr>
	<td><b>가수</b><td>
	<td><input name ="singer" value="아이브"> </td>
</tr>
<tr>
	<td><b>장르</b><td>
	<td><input name ="genre" value="댄스"></td>
</tr>
<tr>
	<td><b>앨범</b><td>
	<td> <input name ="album" value="17.jpg"> </td>
</tr>
</table>

<!-- 
ID: <input name ="id" value="8"><br>
NAME : <input name ="name" value="ELEVEN"><br>
SINGER: <input name ="singer" value="아이브"><br>
GENRE: <input name ="genre" value="댄스"><br>
ALBUM: <input name ="album" value="17.jpg"><br> -->
<button type="submit" class="btn2"> 노래 추가하기</button>
</form>
</div>
</body>
</html>