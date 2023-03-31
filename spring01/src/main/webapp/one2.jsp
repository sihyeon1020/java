<%@page import="com.multi.mvc01.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 검색</title>
<style>
body{background:pink}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>

<%
//세션에서 값을 꺼내는 방법
	String id = (String)session.getAttribute("id");
//모델에서 값을 꺼내는 방법
//model.addAttribute("bag",bag);
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer = bag.getWriter();
	if(id.equals(writer)){ %>
<a href="update2.multi">
	<button style="background:black; color:white;">수정</button>
</a>
<a href="delete2.multi?no=${bag.no }">
	<button style="background:black; color:white;">삭제</button>
</a>
<br>
<%} %>

<a href="list2">게시물 전체 목록페이지</a><br>
게시글이 검색 되었습니다.<br>
${bag.no }<br>
${bag.title }<br>
${bag.content }<br>
${bag.writer }<br>
</body>
</html>