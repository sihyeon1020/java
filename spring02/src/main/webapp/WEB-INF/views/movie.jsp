<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!--  computer 호출했을 때 결과 담는 곳 -->
	<table border=1>
	<tr>
		<td style="background:skyblue">영화 제목</td>
		<td style="background:skyblue">영화 가격</td>
	</tr>
	<tr>
		<td style="background:yellow">${vo.name}</td>
		<td style="background:yellow">${vo.price}</td>
	</tr>
	<tr>
		<td><a href="">문자인증받기</a></td>
	</table>