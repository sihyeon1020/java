<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력화면</title>
</head>
<body>
<a href="list2.multi">모든 게시글 정보 가지고 오기</a>
<a href="one2.multi?no=2">2번 검색</a>
현재 게시물 조회수 ${count}

<% if(session.getAttribute("id") != null ) { %>

<h3>게시글 입력 화면입니다.</h3>
<hr color="red">
<form action="insert2.multi" method="get">
title : <input name= "title"  value="방가루"><br>
content : <input name= "content"  value="화요일입니당"><br>
writer : <input name= "writer"  value="${id}"><br>
<button type="submit">서버로 전송</button>
</form>

<h3>게시글 수정 화면입니다.</h3>
<hr color="red">
<form action="update2.multi" method="get">
no : <input name= "no" value="1"><br>
content : <input name= "content"  value="화요일입니당"><br>
<button type="submit">서버로 전송</button>
</form>

<h3>게시글 삭제 화면입니다.</h3>
<hr color="red">
<form action="delete2.multi" method="get">
no : <input name= "no" value="1"><br>
<button type="submit">서버로 전송</button>
</form>

<%} else { %>

로그인 하세요.

<a href="login.jsp"><br>
	<button style="background:black; color:white;">로그인 화면으로</button>
</a>

<% } %>

<h3>게시글 검색 화면입니다.</h3>
<hr color="red">
<form action="one2.multi" method="get">
no : <input name= "no" value="1"><br>
<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>