<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container p-5 my-5 border">
<form action="login" method="get">
id: <input name= "id" value="grape"><br>
pw: <input name="pw" value="1234"><br>
<button type ="submit">로그인</button>
</form>
<hr>

<form action="insert" method="get">
id: <input name ="id" value = "grape"><br>
pw:<input name="pw" value = "1234"><br>
name: <input name="name" value = "포도"><br>
<button type="submit" >회원가입</button>
</form>
</div>
</body>
</html>