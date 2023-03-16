<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO33"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	MemberDAO33 dao = new MemberDAO33();
    	MemberVO bag3 =  dao.one(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 검색을 원하는 아이디는 <%= id %>
<hr color="red">
검색한 비번: <%= bag3.getPw() %> <br>
검색한 이름: <%= bag3.getName() %> <br>
검색한 글쓴이 : <%= bag3.getTel() %> <br>
</body>
</html>