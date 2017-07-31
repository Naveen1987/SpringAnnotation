package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	public First(String a){}
//   	ServletConfig config;
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//    super.init(config);
//	
//	}

   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getServletContext().log(config.getInitParameter("one"));
//		getServletContext().log(getServletConfig().getInitParameter("one"));
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		throw new ServletException("GET method is not supported.");
	}

	@Override
	public void init() throws ServletException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
