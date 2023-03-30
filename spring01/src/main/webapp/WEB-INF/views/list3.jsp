<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북마크 전체 리스트</title>
<style>
body {
	background: yellow;
}
td{
	width:100px;
	text-align:center;
}
.top{
	background:black;
	color:white;
}
.down{
	background:white;
}
</style>
</head>
<body>
<!--  표현식(expression) --> 
북마크 전체 요청이 완료되었습니다.<br>
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
<!-- 	for (String s : list) {
			
		}
 -->
 <table>
 <tr>
 	<td class="top">ID</td>
 	<td class="top">NAME</td>
 	<td class="top">URL</td>
 	<td class="top">IMG</td>
 </tr>
<c:forEach items="${list}" var="bag" begin="0" end="10" step="2">
 <tr>
 	<td class="down">${bag.id}</td>
 	<td class="down"><a href="one3.multi?id=${bag.id}">${bag.name}</a></td>
 	<td class="down">${bag.url} </td>
 	<td class="down"><img src="resources/img/${bag.img}" width="250" height="auto"></td>
 </tr>
</c:forEach>
</table>
</body>
</html>