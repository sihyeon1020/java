<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1.전달된 값 받아주세요 (request 이용) -->
    <!-- 2.dao에게 값 전달. (DAO 이용)생략 -->
    <!-- 3.전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: skyblue;
}
</style>
</head>
<body>
글쓰기가 요청되었음.
<hr color="blue">
no : <%= no %> <br>
title : <%= title %> <br>
content : <%= content %> <br>
writer : <%= writer %> <br>
</body>
</html>