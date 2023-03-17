<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String singer = request.getParameter("singer");
    
    
    //1.받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
    	MusicVO bag = new MusicVO();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setSinger(singer);
    	
    //2.dao에게 가방을 전달하면서 insert해달라고 하자
    	MusicDAO dao = new MusicDAO();
    	dao.update(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 정보 수정 페이지</title>
<style type="text/css">
body {
	background: skyblue;
}
</style>
</head>
<body>
노래 정보가 수정 되었음.
<hr color="white">
수정을 원하는 음악 아이디는 <b><%=id%> </b><br>
수정을 원하는 음악 이름은 <b> <%=name %> </b>
수정을 원하는 가수 이름은 <b> <%=singer %> </b>
</body>
</html>