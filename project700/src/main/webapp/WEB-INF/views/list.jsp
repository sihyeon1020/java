<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 전체 리스트</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
영화 전체 리스트 입니다.<br>
 <table class="table">
     <thead class="table-dark">
 <tr>
 	<td class="top">ID</td>
 	<td class="top">Title</td>
 	<td class="top">Genre</td>
 	<td class="top">Grade</td>
 	<td class="top">Director</td>
 </tr>
 </thead>
<c:forEach items="${list}" var="bag">
 <tr>
 	<td class="down">${bag.id}</td>
 	<td class="down">${bag.title} </td>
 	<td class="down">${bag.genre} </td>
 	<td class="down">${bag.grade} </td>
 	<td class="down">${bag.director}</td>
 </tr>
</c:forEach>
</table>
</body>
</html>