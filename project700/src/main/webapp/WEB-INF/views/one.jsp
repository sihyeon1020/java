<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 검색 완료</title>
<style>
body{background:pink}
</style>
</head>
<body>
<!--  표현식 (expression) -->
<h3>영화가 검색되었습니다. <br></h3>
<%-- model의 속성으로 받은 bag은 EL로 출력한다.  --%>
<!-- EL : 속성으로 지정한 값 꺼내서 출력해주세요! 라는 의미  -->
${bag.id} <br>
${bag.title} <br>
${bag.genre} <br>
${bag.grade} <br>
${bag.director} <br>

</body>
</html>