<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A 頁面</title>
</head>
<body>
<jsp:useBean id="userBean" scope="session" class="com.chien.User">
<jsp:setProperty name="userBean" property="userid" value="5569884" />
<jsp:setProperty name="userBean" property="userName" value="錢彥綸" />
</jsp:useBean>

<form action="b.jsp" method="post">
	<input type="submit" value="轉跳B頁面 -->">
</form>
</body>
</html>