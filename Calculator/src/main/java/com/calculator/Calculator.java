package com.calculator;

import jakarta.servlet.GenericServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter out =  response.getWriter();
		String f_val = request.getParameter("f_val");
		int first = Integer.parseInt(f_val);

		String s_val = request.getParameter("s_val");
		int second = Integer.parseInt(s_val);


		String operation = request.getParameter("operation");

		switch (operation) {
		case "+": {
			out.println("<h1>"+(first + second)+" </h1>");
			break;
		}
		case "-": {
			out.println("<h1>"+(first - second)+" </h1>");


			break;
		}
		case "*": {
			out.println("<h1>"+(first * second)+" </h1>");

			break;
		}
		case "/": {
			out.println("<h1>"+(first / second)+" </h1>");

			break;
		}
		default:{
			out.println("<h1> invalid input </h1>");
		}

		}
	}
}
