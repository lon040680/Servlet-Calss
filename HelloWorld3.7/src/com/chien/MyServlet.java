package com.chien;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("UTF-8");
		
		String[] c1s = request.getParameterValues("c1");
		String[] selectedlangs = request.getParameterValues("selectedlang");
		String name= request.getParameter("username");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>你喜歡那些語言 : </h3>");
		out.print(Arrays.toString(c1s));
		out.print("<h3>請選擇你喜歡的計算機編成語言 : </h3>");
		out.print(Arrays.toString(selectedlangs));
		out.print("<h3>用戶名 : </h3>");
		out.print(name);
		
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
