<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	json.put("today","rain");
	json.put("temp",16);
	json.put("hu",82);
	
%><%= json.toJSONString()  %>