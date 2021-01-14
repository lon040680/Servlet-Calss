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

@WebServlet(name = "DeleteServlet_2", urlPatterns = {"/delsession"})
public class DeleteServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// String username = request.getParameter("username"); 有沒有都無所謂了
		//設置Cookie
		//Cookie cookie = new Cookie("username", null);
		//Cookie 記住的時間 秒為單位
		//cookie.setMaxAge(0);
		//添加 Cookie, 要保證在 out.close() 之前執行
		//response.addCookie(cookie);
		
		//刪除Session
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("<!DOCTYPE html>");
		sbr.append("<html>");
		sbr.append("<head>");
		sbr.append("	<meta charset=\"UTF-8\">");
		sbr.append("	<title>已刪除 Cookie 頁面</title>");
		sbr.append("</head>");
		sbr.append("<body>");
		sbr.append("	<p>Cookies 已刪除</p>");
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
