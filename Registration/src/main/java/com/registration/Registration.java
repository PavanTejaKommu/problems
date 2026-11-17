package com.registration;

import jakarta.servlet.GenericServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		int marks = Integer.parseInt(request.getParameter("marks"));
		String location = request.getParameter("location");

		

		String URL = "jdbc:mysql://localhost:3306/registration";
		String username = "root";
		String password = "root";
		String query = "insert into registration_details values(?,?,?,?,?)";

		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(URL, username, password);
			out.println("<h1> Connection Established </h1>");
			PreparedStatement ps = connection.prepareStatement(query);
			//ResultSet rs = ps.executeQuery();
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setInt(3, age);
			ps.setInt(4, marks);
			ps.setString(5, location);

			int rows = ps.executeUpdate();

			out.println("<h1>" + rows + "rows effected</h1>");
			connection.close();
			ps.close();
			//rs.close();
		} catch (Exception e) {

			out.println("<h1 style='color:red';>" + e.getMessage() + "</h1>");

		}
		
		out.close();
		
		

	}

}
