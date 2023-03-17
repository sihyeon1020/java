
<%@page import="multi.MusicVO"%>
<%@page import="multi.MusicDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	MusicDAO dao = new MusicDAO();
    	MusicVO bag = dao.one(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  <style>
  #b1{
  background:#212529
  fontcolor:white}
  </style>
</head>
<body>

 <table class="table table-striped">
 	<tr>
 		<td>음악 아이디</td>
 		<td><%= bag.getId() %></td>
 	</tr>
 	<tr>
 		<td>음악 이름</td>
 		<td><%= bag.getName() %></td>
 	</tr>
 	<tr>
 		<td>가수명</td>
 		<td><%= bag.getSinger() %></td>
 	</tr>
 	
 	<tr>
 		<td>음악 장르</td>
 		<td><%= bag.getGenre() %></td>
 	</tr>
 	
 	<tr>
 		<td>앨범</td>
 		<td><img src="img/<%= bag.getAlbum() %>" width="150" height="150"></td>
 	</tr>
 


 </table>
 
 	<a href="list5.jsp">
		<button id="b1" >뒤로 가기</button>
	</a>
	
</body>
</html>