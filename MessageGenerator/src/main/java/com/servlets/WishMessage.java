package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		Date dt = new Date();
		int hr = dt.getHours();
		if (hr<12) {
			pw.println("Good Morning Abhi");
		} else if (hr<16){
			pw.println("Good Afternoon Abhi");
		}else if (hr<20){
			pw.println("Good Evening Abhi");
		}else {
			pw.println("Good Night Abhi");
		}
	}
}
