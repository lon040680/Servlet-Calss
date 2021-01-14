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

@WebServlet(name = "BServlet_2", urlPatterns = {"/bpage2"}, loadOnStartup=1)
public class BServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String username = request.getParameter("username");  //username請求用變數
		
		//設置Cookie
		//Cookie cookie = new Cookie("username", username);
		//Cookie 記住的時間 秒為單位
		//cookie.setMaxAge(1000);
		//添加 Cookie, 要保證在 out.close() 之前執行
		//response.addCookie(cookie);
		
		//獲得Session
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(30); //可以在這裡設置記住Session的時間 但絕對不要在這種地方設置不安全
		//設置Session屬性
		session.setAttribute("username", username);
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("<!DOCTYPE html>");
		sbr.append("<html>");
		sbr.append("<head>");
		sbr.append("	<meta charset=\"UTF-8\">");
		sbr.append("	<title>B 頁面</title>");
		sbr.append("</head>");
		sbr.append("<body>");
		sbr.append("<form action=\"cpage2\" method=\"post\">");
		//username放到這裡
		sbr.append("	用户名：").append(username).append(" <br>");
		//傳兩個參數使用 ?page=B&username=
		sbr.append("	<a href=\"cpage2?page=B&username=").append(username).append("\">跳轉到C頁面</a>"); 
		sbr.append("</form>");
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