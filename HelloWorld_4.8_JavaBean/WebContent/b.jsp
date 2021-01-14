<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>B 頁面</title>
</head>
<body>
<!-- 	注意useBean id 要跟送值過來的頁相同 -->
	<jsp:useBean id="userBean" scope="session" class="com.chien.User">	</jsp:useBean>
	<jsp:getProperty name="userBean" property="userid"/>
	<jsp:getProperty name="userBean" property="userName"/>
</body>
</html>