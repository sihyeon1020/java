<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 삭제 완료</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
 div { position:relative; }
  #cm { position:absolute; }
  .hc { width:200px; left:0; right:0; margin-left:auto; margin-right:auto; } /* 가로 중앙 정렬 */
  .vc { height:40px; top: 0; bottom:0; margin-top:auto; margin-bottom:auto; } 
</style>
</head>
<body>
<div  class="container pt-5">
  <p id="cm" class="hc vc"><h4>노래가 삭제되었습니다.</h4>
   	<a href="list4.multi">
		<button class="btn btn-dark" >목록보기</button>
	</a>
</div> 
</body>
</html>