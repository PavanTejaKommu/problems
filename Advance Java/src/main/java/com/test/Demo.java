package com.test;

import jakarta.servlet.GenericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String num = request.getParameter("number");
		int n = Integer.parseInt(num);

		if (n % 2 == 0) {
			out.println("<h1 style='color:green;'> " + n + " is even number...</h1>");
		} else {
			out.println("<h1 style='color:red;'> " + n + " is odd number...</h1>");
		}
	}

}
