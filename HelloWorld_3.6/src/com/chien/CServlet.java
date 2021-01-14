package com.chien;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CServlet", urlPatterns = {"/cpage"})
public class CServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String page = request.getParameter("page");
		String username = request.getParameter("username");  //username請求用變數
		
		response.setContentType("text/html; charset=UTF-8");
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("<!DOCTYPE html>");
		sbr.append("<html>");
		sbr.append("<head>");
		sbr.append("	<meta charset=\"UTF-8\">");
		sbr.append("	<title>C 頁面</title>");
		sbr.append("</head>");
		sbr.append("<body>");
		sbr.append("	用户名：").append(username).append(" <br>");  //username放到這裡
		sbr.append("	上一個頁面: ").append(page).append("</a>").append("<br>");
		sbr.append("	<a href=\"apage.html\">跳轉回A頁面</a>");
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
