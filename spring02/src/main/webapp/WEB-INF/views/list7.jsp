<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1" style="width:800px;">
		<tr style="background:skyblue; text-align:center;">
			<td><b>id</b></td>
			<td ><b>name</b></td>
			<td><b>content</b></td>
			<td><b>price</b></td>
			<td><b>company</b></td>
			<td><b>img</b></td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

		<tr style=" text-align:center;">
				<td>${bag.id}</td>
				<td>${bag.name}</td>
				<td>${bag.content}</td>
				<td>${bag.price}</td>
				<td>${bag.company}</td>
				<td>${bag.img}</td>
			</tr>

		</c:forEach>
	</table>
