<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션속성 등록2</title>
</head>
<body>
<% session.setAttribute("count", 100);  %>
시작 현재 카운트 : <%= session.getAttribute("count") %>, ${count}
<hr>
<a href="session속성가지고오기2.jsp">session속성가지고오기2</a>
</body>
</html>