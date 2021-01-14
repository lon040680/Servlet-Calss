<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ONE</title>
</head>
<body>
		<a>這是one.jsp的文字</a>
		<a href = "two.jsp">GO page Two</a>
		<% 
			String name = request.getParameter("name");
		%>
		<a>這是傳遞過來的值<%=name%></a>
</body>
</html>