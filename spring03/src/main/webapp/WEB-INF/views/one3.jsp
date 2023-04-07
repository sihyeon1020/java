<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북마크 완료</title>
<style>
body{background:pink}
</style>
</head>
<body>
<!--  표현식 (expression) -->
<h3>북마크가 검색되었습니다. <br></h3>
<%-- model의 속성으로 받은 bag은 EL로 출력한다.  --%>
<b>북마크 번호 : </b>${bag.id} <br><!-- 출력용 (expression language-EL) -->
<b>북마크 이름 : </b>${bag.name} <br>
<b>북마크 주소  :</b> ${bag.url} <br>
<img src="resources/img/${bag.img}" width="250" height="auto"> <br>
</body>
</html>