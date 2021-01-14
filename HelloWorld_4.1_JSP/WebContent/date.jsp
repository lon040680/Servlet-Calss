<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 表達式</title>
</head>
<body>
<h2>表達式範例</h2>
<h4>當前時間: <%= new java.util.Date() %></h4>
<h4>傳輸協議: <%= request.getProtocol() %></h4>
<h4>1 + 1 = <%= 1+1 %></h4>
</body>
</html>