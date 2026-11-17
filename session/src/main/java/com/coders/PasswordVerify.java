package com.coders;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordVerify
 */
@WebServlet("/PasswordVerify")
public class PasswordVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PasswordVerify() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String passwords = request.getParameter("password");

		String url = "jdbc:mysql://localhost:3306/sessions";
		String user = "root";
		String password = "root";
		String query = "select * from details where password = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connetion = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = connetion.prepareStatement(query);

			ps.setString(1, passwords);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				rs.close();
				RequestDispatcher rds = request.getRequestDispatcher("home.html");
				rds.forward(request, response);
			} else {
				rs.close();
				response.getWriter().println("Wrong Password");
				RequestDispatcher res = request.getRequestDispatcher("EmailVerify");
				res.include(request, response);
			}

			ps.close();
			connetion.close();
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().println("<h1> " + e.getMessage() + "</h1>");
		}

	}

}
