<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원전체 검색 완료</title>
<style>
body{background:pink}
</style>
</head>
<body>
<!--  표현식 (expression) -->
<h3>회원이 검색되었습니다. <br></h3>
<%-- model의 속성으로 받은 bag은 EL로 출력한다.  --%>
<!-- EL : 속성으로 지정한 값 꺼내서 출력해주세요! 라는 의미  -->
<!--  for(String s : list) {
 			}
 -->
<c:forEach items="${list}" var = "bag" begin="1" end="3" step="2">
${bag.id} <br><!-- 출력용 (expression language-EL) -->
${bag.pw} <br>
${bag.name} <br>
${bag.tel} <br>
</c:forEach>
</body>
</html>