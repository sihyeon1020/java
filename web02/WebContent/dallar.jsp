<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String d = request.getParameter("dallar");
	int dallar = Integer.parseInt(d);
	int won = 1283;
	int result = dallar*won ;
%><%= result %>