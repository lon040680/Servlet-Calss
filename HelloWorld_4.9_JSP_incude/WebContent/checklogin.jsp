<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入檢查</title>
</head>
<body>
	<%--进行登录检查--%>
	<%
     String name = request.getParameter("username");
     String password = request.getParameter("password");
     // if 验证通过，forward 夾帶 value值 -->sucess.jsp
     //else forward-->login.jsp
     String userid = "669685";
  	if (name.equals("lon040680") && password.equals("780406")) { 
  		//轉跳登入成功頁面
  		//重新定向		
  		//response.sendRedirect("sucess.jsp?username=" + name + "&password=" + password + "&userid=" + userid); //轉跳方法 後面要加? 才可以傳送值到下個頁面
  				
  		//request方法轉跳 代替
  		RequestDispatcher dispatcher= request.getRequestDispatcher("sucess.jsp");
  		//RequestDispatcher 派發器
  		dispatcher.forward(request, response);  //因為其值都其實有送到 request, response 所以值就會自動獲取了
  	}
 	else {
 		//response.sendRedirect("login.jsp");	//轉跳方法
 		out.print("<h2>登入失敗 !</h>");
 	} 	 
 	 %>
</body>
</html>

<%-- jsp:forward 這個方法比較麻煩打

<%
if (name.equals("lon040680") && password.equals("780406")) {
	<%
	<jsp:forward page="sucess.jsp">
		<jsp:param name="userid" value="669685" />
	</jsp:forward>
	<% }
 	else { %>
		<jsp:forward page="login.jsp" />
	<% } %>
--%>