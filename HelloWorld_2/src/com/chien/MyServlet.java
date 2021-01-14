package com.chien;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, res);  一旦改寫到下方 這行就不可以有了
		
		//強制改名
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		request.setCharacterEncoding("UTF-8"); //請求字符集
		
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset=UTF-8"); //回應字符集
		//response.setCharacterEncoding("UTF-8"); 這個就是如同上方 charset=UTF-8
		
		PrintWriter out = response.getWriter();
		out.println("<h3>這是一個service請求</h3>");
		out.println("<h3>name參數: " + name + ".</h3>");
		out.close();
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		
//		String name = request.getParameter("name");
//			
//		PrintWriter out = response.getWriter();
//		out.println("<h3>這是一個POST請求</h3>");
//		out.println("<h3>name參數: " + name + ".</h3>");
//		out.close();
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		
//		String name = request.getParameter("name");
//
//		PrintWriter out = response.getWriter();
//		out.println("<h3>這是一個GET請求</h3>");
//		out.println("<h3>name參數: " + name + ".</h3>");
//		out.close();
//	}
}