<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html><html>
<head><meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
<title>Login</title>
</head>
<body>
	<div class="container py-4">
	<%@include file="menu.jsp" %>
	
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
			<h1 class="display-5 fw-bold">회원 로그인</h1>
			<p class="col-md-8 fs-4">Member Login</p>
			</div>
		</div>
		
		<div class="container" align="center">
			<div class="col-md-4 col-md-offset-4">
				<h3 class="form-signin-heading">로그인</h3>
				<%
					String error=request.getParameter("error");
					if(error !=null){
						out.println("<div class='alert alert-danger'>");
						out.println("아이디와 비밀번호를 확인해 주세요");
						out.println("</div>");
					}
				%>
				<form class="form-signin" action="processLoginMember.jsp" method="post">
				
				<div class="form-floating mb-3 row">
					<input type="text" class="form-control" name="id"  id="floatingInput" placeholder="아이디" required autofocus>
					<label for="floatingInput">ID</label>
				</div>
				
				<div class="form-floating mb-3 row">
					<input type="password" class="form-control" name="password"  placeholder="비밀번호" >
					<label for="floatingPassword">Password</label>
				</div>
					
				<button class="btn btn btn-lg btn-success btn-block" type="submit">로그인</button>
				
				</form>
			</div>
		</div>
		
	</div>
</body>
</html>