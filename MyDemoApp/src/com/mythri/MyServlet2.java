package com.mythri;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//response data preparation
		request.setAttribute("msg1", "Development in progress...");
		request.setAttribute("msg2", "Im not available right now");
		request.setAttribute("value",1000);
		//forward to jsp
		request	
		.getRequestDispatcher("/response2.jsp")
		.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
