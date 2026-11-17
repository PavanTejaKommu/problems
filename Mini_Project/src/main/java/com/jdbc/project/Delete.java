package com.jdbc.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Delete() {
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

		String deleteBy = request.getParameter("selectBy");
		String valueEntered = request.getParameter("valueTo");

		int enteredValue = 0;

		String URL = "jdbc:mysql://localhost:3306/miniproject";
		String user = "root";
		String password = "root";

		String query = "delete from students  where " + deleteBy + " = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, user, password);

			PreparedStatement ps = connection.prepareStatement(query);

			if (deleteBy.equals("id") || deleteBy.equals("age") || deleteBy.equals("marks")) {
				enteredValue = Integer.parseInt(valueEntered);

				ps.setInt(1, enteredValue);
			} else {
				ps.setString(1, valueEntered);
			}

			int rows = ps.executeUpdate();

			out.println("<h1 style'color:green'> Delete completed " + rows + " rows effected </h1>");
			out.println("<a href='index.html'>Go to Home Page </a>");

			ps.close();
			connection.close();

		} catch (Exception e) {

			out.println("<h1 style='color:red'> " + e.getMessage() + "</h1>");

		}
		out.close();
	}

}
