package com.chien;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BServlet", urlPatterns = {"/bpage"})
public class BServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");  //username請求用變數
		
		response.setContentType("text/html; charset=UTF-8");
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("<!DOCTYPE html>");
		sbr.append("<html>");
		sbr.append("<head>");
		sbr.append("	<meta charset=\"UTF-8\">");
		sbr.append("	<title>B 頁面</title>");
		sbr.append("</head>");
		sbr.append("<body>");
		sbr.append("<form action=\"cpage\" method=\"get\">");
		//username放到這裡
		//sbr.append("	用户名：").append(username).append(" <br>");
		//傳兩個參數使用 ?page=B&username=
		//sbr.append("	<a href=\"cpage?page=B&username=").append(username).append("\">跳轉到C頁面</a>"); 
		//隱藏送值方法 type=hidden
		sbr.append("	<input type=\"submit\" value=\"轉跳到C 頁面\">");
		sbr.append("	<input type=\"hidden\" name=\"username\" value=\"").append(username).append("\">");
		sbr.append("    <input type=\"hidden\" name=\"page\" value=\"B\">");
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
