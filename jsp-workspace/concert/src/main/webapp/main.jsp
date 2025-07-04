<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>
<head><meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
<title>Welcome</title></head>
<body>
	
	<div class="container py-4">
	<%@include file="menu.jsp" %>
	
	<%!
		String greeting="Welcome to Concert";
		String tagline="Welcome";
	%>
	
	<!-- 중간 타이틀 영역 -->
	<div class="p-5 mb-4 bg-body-tertiary rounded-3">
		<div class="container-fluid py-5">
			<h1 class="display-5 fw-bold"><%=greeting %></h1>
			<p class="col-md-8 fs-4">Concert</p>
		</div>
	</div>
	<div class="row align-items-md-stretch text-center">
		<div class="col-md-12">
			<div class="h-100 p-5">
				<h3><%=tagline %></h3>
			</div>
		</div>
	</div>
	</div>
</body>
</html>