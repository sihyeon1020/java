
<%@page import="multi.MusicVO"%>
<%@page import="multi.MusicDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	MusicDAO dao = new MusicDAO();
		ArrayList<MusicVO> list = dao.list();
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
  a{
	text-decoration: none;
	color: gray;
}
	
	a:hover{
	color:blue;
	}
  </style>
</head>
<body>
<% if(list.size() == 0){ %>
<h3>등록된 노래가 없습니다.</h3>
<img src="img/not.png" width=250 height=250>
 <%} else { %>
 <table class="table">
 <thead class="table-dark">
 <tr>
 	<td><b>id</b></td>
 	<td><b>name</b></td>
 	<td><b>singer</b></td>
 	<td><b>genre</b></td>
 </tr>
 </thead>
<%
	for(MusicVO bag: list){
%>
 <tr>
 	<td><%= bag.getId() %></td>
 		<td>
 			<a href="one5.jsp?id=<%= bag.getId()%>">
 				<%= bag.getName()%>
 			</a>
 		</td>
 	<td><%= bag.getSinger()%></td>
 	<td><%= bag.getGenre()%></td>
 </tr>

 <%
	} //for
 %>
  </table>
  <% } //else%>
  
  	<form action="search.jsp">
  	<table border="1">
			<tr>
				<td class="t1">가수 이름</td>
				<td><input name="singer"></td>
				<td colspan="2" class="t1">
					<button id="b2">검색</button>
				</td>
			</tr>
			<tr>
			</tr>
		</table>
	</form>
</body>
</html>