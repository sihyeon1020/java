<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
    
    //1.가방을 만들어주기 
    MemberVO bag = new MemberVO();
    //2.가방에 값 넣기
    bag.setId(id);
    bag.setTel(tel);
    
    //3.dao에 가방 전달
    MemberDAO3 dao = new MemberDAO3();
    dao.update(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정 요청 페이지</title>
<style type="text/css">
body{
	background: skyblue;
}
</style>
</head>
<body>
수정이 요청되었음.
<hr color="blue">
id : <%= id %> <br>
tel : <%= tel %>
</body>
</html>