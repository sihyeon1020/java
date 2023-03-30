<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 전체 리스트</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
  a{
	text-decoration: none;
	color: gray;
}
	
	a:hover{
	color:blue;
	}
 td{text-align: center;'}
 .r{float:right;}
</style>
</head>
<body>
<div class="container pt-5">
 <table class="table">
  <thead class="table-dark">
 <tr>
 	<td class="top">ID</td>
 	<td class="top">NAME</td>
 	<td class="top">SINGER</td>
 	<td class="top">GENRE</td>
 </tr>
 </thead>
<c:forEach items="${list}" var="bag">
 <tr>
 	<td class="down">${bag.id}</td>
 	<td class="down"><a href="one4.multi?id=${bag.id}">${bag.name}</a></td>
 	<td class="down">${bag.singer} </td>
 	<td class="down">${bag.genre} </td>
 </tr>
</c:forEach>
</table>

<hr>
 	<a href="music.jsp">
		<button class="btn btn-dark" >메인으로</button>
	</a>
	<a href="music_insert.jsp">
		<button class="btn btn-primary r"  >노래 추가하기</button>
	</a>
</div>
</body>
</html>