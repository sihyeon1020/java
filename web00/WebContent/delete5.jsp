<%@page import="multi.MusicDAO"%>
<%@page import="multi.MusicVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	//클라이언트가 입력한 no를 서버에서 받아주기(자바로)
    	//Car car = new Car();
  		//HttpServletRequest request = new HttpServletRequest(); 
    	String id = request.getParameter("id");
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	MusicVO bag = new MusicVO();
    	bag.setId(id);
    	//가방전달
    	MusicDAO dao = new MusicDAO();
    	dao.delete(bag);
  
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
삭제될 음악의 아이디는 <%= id %>
</body>
</html>