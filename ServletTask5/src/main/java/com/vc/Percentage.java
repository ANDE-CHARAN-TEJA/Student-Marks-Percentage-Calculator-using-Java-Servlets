package com.vc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Percentage
 */
@WebServlet("/Percent")
public class Percentage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String ma = request.getParameter("Mama");
		String py = request.getParameter("Phma");
		String ch = request.getParameter("Chma");
		
		int m = Integer.parseInt(ma);
		int p = Integer.parseInt(py);
		int c = Integer.parseInt(ch);
		
		int per = ((m+p+c)*100/(300));
		
		out.println(name);
		out.println(per);
			
	}

}
