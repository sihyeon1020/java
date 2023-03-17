<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%   
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String singer = request.getParameter("singer");
    String genre = request.getParameter("genre");
    String album = request.getParameter("album"); 
    
    
    //1.받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
    MusicVO bag = new MusicVO();
   	bag.setId(id);
   	bag.setName(name);
   	bag.setSinger(singer);
   	bag.setGenre(genre);
   	bag.setAlbum(album);
	
	//2.dao에게 가방을 전달하면서 insert해달라고 하자
	MusicDAO dao = new MusicDAO();
	dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 추가 요청페이지</title>
<style type="text/css">
body{
	background: skyblue;
}
</style>
</head>
<body>
제품 추가가 요청되었음
<hr color="blue">
id : <%= bag.getId() %> <br>
name : <%= bag.getName() %> <br>
singer : <%= bag.getSinger() %> <br>
genre : <%= bag.getGenre() %> <br>
album : <%= bag.getAlbum() %> <br>
<!-- img src=img/shoes1.jpg -->
<%-- img : <img src="img/<%= bag.getImg() %>" width=300 height=200> <br> --%>
</body>
</html>