<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정리문제 list</title>
</head>
<body>
전체 조회수 : <%= session.getAttribute("view") %><br>
<%
 if(session.getAttribute("view") == null){
	 out.print("아무도 방문하지 않았습니다.");
 }else {
	 out.print("방문 횟수는 " + session.getAttribute("view"));
 }
%>
<hr color="red">
</body>
</html>