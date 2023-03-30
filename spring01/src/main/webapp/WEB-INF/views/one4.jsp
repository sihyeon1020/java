<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 상세페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
</style>
</head>
<body>
<!--  표현식 (expression) -->
<%-- model의 속성으로 받은 bag은 EL로 출력한다.  --%>
<div  class="container pt-5">
<table  class="table table-striped">

<tr>
	<td><b>노래 이름</b><td>
	<td>${bag.name} </td>
</tr>
<tr>
	<td><b>가수</b><td>
	<td> ${bag.singer} </td>
</tr>
<tr>
	<td><b>장르</b><td>
	<td>${bag.genre}  </td>
</tr>
<tr>
	<td><b>앨범</b><td>
	<td><img src="resources/img/${bag.album}" width="250" height="auto"> </td>
</tr>
</table>

<hr>
 	<a href="list4.multi">
		<button class="btn btn-dark" >목록보기</button>
	</a>
	<a href="music_delete.jsp">
		<button class="btn btn-danger"  >노래 삭제하기</button>
	</a>
	</div>
</body>
</html>