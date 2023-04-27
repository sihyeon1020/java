<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String name = request.getParameter("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel= "stylesheet"  type="text/css"  href="resources/css/style.css">
</head>
<body>
<div class="container p-5 my-5 border">
<% if(session.getAttribute("id") == null ) { %>
<%} else { %>
<h3>팝콘 먹는 사람들</h3><br>
<p class="m_name"><b>${id}</b>님</p>
<hr>
<p class="m_title">내가 쓴 리뷰 </p><br>
<div class="rev_result">
</div>
<hr>
<p class="m_title">찜 목록</p> <br>
<div class="jjim_result"></div>

</div> <!-- container -->
<%} %>
</body>
</html>