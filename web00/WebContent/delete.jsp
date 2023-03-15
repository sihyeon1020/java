<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1.전달된 값 받아주세요 (request 이용) -->
    <!-- 2.dao에게 값 전달. (DAO 이용)생략 -->
    <!-- 3.전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    String id = request.getParameter("id");
    
    //1. 가방 만들어서 값 넣기
    MemberVO bag = new MemberVO();
    bag.setId(id);
    
    //2. dao에게 가방 전달
    MemberDAO3 dao = new MemberDAO3();
    dao.delete(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴요청 페이지</title>
<style type="text/css">
body{
	background: skyblue;
}
</style>
</head>
<body>
탈퇴가 요청되었음.
<hr color="blue">
탈퇴할 id : <b><%= id %></b>
</body>
</html>