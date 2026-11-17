package com.calculator;

import jakarta.servlet.GenericServlet;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String num1 = request.getParameter("number_1");
		String num2 = request.getParameter("number_2");
		String operation = request.getParameter("operator");
		int num_1 = Integer.parseInt(num1);
		int num_2 = Integer.parseInt(num2);


		switch (operation) {
		case "+": {
			out.println("<h1 style='color:green;'> "+num_1+"+"+num_2+"="+(num_1 + num_2)+"</h1>");
			break;
		}
		case "-": {
			out.println("<h1 style='color:green;'> "+num_1+"-"+num_2+"="+(num_1 - num_2)+"</h1>");

			break;
		}
		case "x": {
			out.println("<h1 style='color:green;'> "+num_1+"X"+num_2+"="+(num_1 * num_2)+"</h1>");

			break;
		}
		case "/": {
			out.println("<h1 style='color:green;'> "+num_1+"/"+num_2+"="+(num_1 / num_2)+"</h1>");

			break;
		}
		default:
			out.println("<h1 style='color:red;'>Error</h1>");
		}

	}

}
