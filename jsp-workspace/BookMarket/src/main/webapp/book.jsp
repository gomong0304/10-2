<%@page import="dto.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bookDAO" class="dao.BookRepository" scope="session" />
<!-- 자바 빈즈를 이용해서 객체를 가져옴.             			저장은 세션 영역 -->
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<title>도서 정보</title></head>
<body>
	<div class="container py-4">
	
		<%@include file="menu.jsp" %>
		<!-- 메뉴바를 외부파일로 연결 -->
		
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">도서정보</h1>
				<p class="col-md-8 fs-4">BookInfo</p>
			</div>
		</div>
		
		<%
			String id = request.getParameter("id");
			Book book=bookDAO.getBookById(id);
		%>
		
		<div class="row align-items-md-stretch">
			<div class="col-md-12">
				<h3><b><%=book.getName() %></b></h3>
			</div>
		</div>
	</div>
</body>
</html>