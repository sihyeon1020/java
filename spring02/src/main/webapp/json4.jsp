<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	json.put("high",80000);
	json.put("low",65000);
	json.put("end",74000);
	
	JSONObject json2 = new JSONObject();
	json2.put("high",85000);
	json2.put("low",65000);
	json2.put("end",74000);
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
%><%= array.toJSONString()  %>