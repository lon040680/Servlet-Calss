<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP + 變數聲明</title>
</head>
<body bgcolor="#FFFFFF">
變數:
	<%! int i = 0;
		int a, b, c;
		String str = new String("hello");
	%>
<br>
方法: 
	<%!
		public String strTemp(int itemp){
			if (itemp < 10){
				return "itemp比10小";
			}
			else {
				return "iTemp大於等於10";
			}
		}
	%>
	<%=str%><br>
	<%=strTemp(12) %>
</body>
</html>