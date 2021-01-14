<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入成功</title>
</head>
<body>
	<h2>登入成功</h2>
	<h3>userid > <%=request.getParameter("userid") %></h3>
	<h3>username > <%=request.getParameter("username") %></h3>
	<h3>password > <%=request.getParameter("password") %></h3>
</body>
</html>