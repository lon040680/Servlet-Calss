<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>one+two include</title>
</head>
<body>
	<h1>使用include指令</h1>
	<%@include file="one.jsp" %>
	<br>
	<%@include file="two.jsp" %>
	<br>
	<hr>
	<h2>使用include動作</h2>
<!-- flush個元素指的是，是否要刪除緩衝區 true 為刪除，如此會寫到緩衝區溢出(寫滿預設的空間，可以設定大小)就立刻送值進客戶端然後刪除緩衝區資料，然後繼續寫。flase 則反之，要等犬部資料都寫進了緩衝區才送直到客戶端 -->
<%-- 要注意小資料可以用 flase 否則會錯誤 然後死當 所大部分就是用 true--%>
	<jsp:include page="one.jsp" flush="true">
		<jsp:param name="name" value="Aelln" />
	</jsp:include>
	<br>
	<jsp:include page="two.jsp" flush="true"/>
	
	<br>
</body>
</html>