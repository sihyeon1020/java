<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 검색 페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
.btn2{display:block; width:150px; height:40px; border-radius:50px; background: black; color:white; margin:10px 0 0 10px; border: none;}
.btn2:hover{background:gray;}
.btn3{display:block; width:130px; height:30px; border-radius:50px; background: black; color:white; margin:10px 0 0 0; border: none;}
.btn3:hover{background:gray;}
button{margin:10px;}
b{font-size: 18px; font-style: bold}
</style>
</head>
<body>

<a href="list4.multi"><button type="button" class="btn btn-primary" ><b>노래 전체 리스트</b></button></a>


<hr>
<b>검색할 노래의 id를 입력해주세요.</b>
<form action="one4.multi" method="get">
id : <input name= "id" value="1"><button type="submit" class="btn2">검색하기</button>
</form>


</body>
</html>