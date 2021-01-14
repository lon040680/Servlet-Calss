<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat, 
				java.util.Date, 
				java.text.DateFormat" %>

<%
	DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
	Date date = new Date();
	String strDate = df.format(date); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>今天的日期</title>
</head>
<body>
<!-- 我是HTML 注釋 -->
<%-- 我是JSP隱藏的注釋 --%>
<h1>今天的日期 : <%= strDate %></h1>
</body>
</html>