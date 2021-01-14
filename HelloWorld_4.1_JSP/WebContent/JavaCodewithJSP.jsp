<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP+JAVA CODE</title>
</head>
<body>
	<%! String s = "大家好"; %>
	<%
		for (int i = 0; i<3; i++){
			out.print(s + i +"<br>");
		}
	%>
</body>
</html>