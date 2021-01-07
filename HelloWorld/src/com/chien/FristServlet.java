package com.chien;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FristServlet", urlPatterns= {"/FristServlet"}, loadOnStartup=1)
public class FristServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FristServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		System.out.println("客戶端名稱: "+ name);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>HelloWorld</h3>");
		out.print("<h3>" + name + " 哈囉 ! </h3>");
		out.print("<h3>成功囉!!</h3>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
