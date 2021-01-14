package com.chien;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CServlet_2", urlPatterns = {"/cpage2"}, loadOnStartup=2)
public class CServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 取出Cookie
		//String pname = null;
		//Cookie[] cookies = request.getCookies(); // 拿所有Cookie
		//if (cookies != null) {
			// 用for迴圈找一下所有的 Cookie, 用 if 找到並取得
			//for (Cookie cookie : cookies) {
				//if (cookie.getName().equals("username")) {
					//pname = cookie.getValue();
					//break;
				//}
			//}
		//}
		
		//取出 Session
		HttpSession session = request.getSession();
		// 下方索取的 session 是 object , 所以要轉(String) 重點!!!!
		String pname = (String)session.getAttribute("username");
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("<!DOCTYPE html>");
		sbr.append("<html>");
		sbr.append("<head>");
		sbr.append("	<meta charset=\"UTF-8\">");
		sbr.append("	<title>C 頁面</title>");
		sbr.append("</head>");
		sbr.append("<body>");
		sbr.append("	用户名：").append(pname).append(" <br>");
		//sbr.append("	<a href=\"delcookie?username=\"").append(pname).append(">刪除Cookie</a>"); 與下方擇一寫法
		sbr.append("	<a href=\"delsession?username=\"" + pname +">刪除Cookie</a>");
		sbr.append("	<a href=\"apage2.html\">跳轉回A頁面</a>");
		sbr.append("</body>");
		sbr.append("</html>");
		
		PrintWriter out = response.getWriter();
		out.print(sbr.toString());
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
