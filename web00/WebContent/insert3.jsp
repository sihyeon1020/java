<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>


    <%   
  /*   String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img"); */
    
    
    //1.받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
/* 	ProductVO bag = new ProductVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img); */
	
//2.dao에게 가방을 전달하면서 insert해달라고 하자
	ProductDAO dao = new ProductDAO();
	dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 추가 요청 페이지</title>
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
content : <%= bag.getContent() %> <br>
price : <%= bag.getPrice() %> <br>
company : <%= bag.getCompany() %> <br>
<!-- img src=img/shoes1.jpg -->
img : <img src="img/<%= bag.getImg() %>" width=300 height=200> <br>
</body>
</html>