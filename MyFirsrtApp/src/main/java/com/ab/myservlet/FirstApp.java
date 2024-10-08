package com.ab.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstApp extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Getting PrintWriter object from HTTP response
		PrintWriter pw = resp.getWriter();
		
		//Using PrintWriter object to write something in the web page
		pw.println("<h1 style='font-size: 10rem; text-align: center'><span style='color: green'>Congratulations !!!</span>  You got your new <span style='color: red'>Laptop</span></h1>");
		
		//Close PrintWriter object
		pw.close();
		
	}

}
