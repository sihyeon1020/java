<%@page import="multi.ImgDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.ImgVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	ImgDAO dao = new ImgDAO();
	dao.insert(bag);
%>