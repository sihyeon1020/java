<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String no = request.getParameter("no");
    String content = request.getParameter("content");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 페이지</title>
<style type="text/css">
body {
	background: skyblue;
}
</style>
</head>
<body>
게시글 수정이 요청되었음.
<hr color="white">
당신이 수정을 원하는 번호는 <b><%=no %>번 </b><br>
당신이 수정을 원하는 게시글 내용은<b> <%=content %> </b>
</body>
</html>