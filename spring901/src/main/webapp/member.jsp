<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 입력 화면</title>
</head>
<body>
<h3>검색 화면입니다.</h3>
<a href="list">모든 회원정보 가지고 오기</a>

<hr>
<form action="one" method="get">
id : <input name= "id" value="apple"><br>
<button type="submit" style="background:pink">검색</button>
</form>
<hr color="red">

<h3>로그인 화면입니다.</h3>
<hr>
<form action="login" method="get">
id : <input name= "id" value="apple"><br>
pw : <input name= "pw"  value="1234"><br>
<button type="submit" style="background:blue">로그인</button>
</form>
<hr color="red">

<h3>회원가입 화면입니다.</h3>
<hr>
<form action="insert" method="get">
id : <input name= "id" value="samsung"><br>
pw : <input name= "pw"  value="1234"><br>
name : <input name= "name"  value="Lee"><br>
tel : <input name= "tel"  value="010"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="black">

<h3>회원수정 화면입니다.</h3>
<hr>
<form action="update" method="get">
id : <input name= "id" value="apple"><br>
tel : <input name= "tel"  value="010"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color="black">

<h3>회원탈퇴 화면입니다.</h3>
<hr>
<form action="delete" method="get">
id : <input name= "id" value="toss"><br>
<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>