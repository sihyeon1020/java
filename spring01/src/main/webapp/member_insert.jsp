<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 화면입니다.</h3>
<hr color="red">
<form action="insert.jsp" method="get">
id : <input name= "id" value="apple"><br>
pw : <input name= "pw"  value="1234"><br>
name : <input name= "name"  value="Lee"><br>
tel : <input name= "tel"  value="010"><br>
<button type="submit">서버로 전송</button>
</form>
<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>