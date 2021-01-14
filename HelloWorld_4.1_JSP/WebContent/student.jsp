<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
			<td>學號</td>
			<td>學員</td>
		</tr>
		<%! String pn = null;
			int pid = 0;
			String[] name = {"Aelln", "Mary", "Linda", "Coogii", "Grabbi"};
			int[] id = {256698, 668592, 775863, 885462, 558663};
		%>
		<%
			for(int i = 0; i<5; i++){
				pid = id[i];
				pn = name[i];
			
		%>
		<tr>
			<td><%=pid%></td>
			<td><%=pn%></td>
		</tr>
		<% } %>
</table>
</body>
</html>