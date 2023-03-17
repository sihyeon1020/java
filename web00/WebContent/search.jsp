
<%@page import="multi.MusicVO"%>
<%@page import="multi.MusicDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  	    MusicDAO dao = new MusicDAO();
		ArrayList<MusicVO> search = dao.search();

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

 
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
	for(MusicVO bag: search){
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
 	
</body>
</html>