package com.jdbc.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Display() {
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

		String selectBY = request.getParameter("selectBy");
		String selectedValue = request.getParameter("selectedValue");

		String URL = "jdbc:mysql://localhost:3306/miniproject";
		String user = "root";
		String password = "root";

		String query = "select * from  students where " + selectBY + " = ? ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, user, password);
			PreparedStatement ps = connection.prepareStatement(query);
			int newvalue = 0;
			if (selectBY.equals("id") || selectBY.equals("age") || selectBY.equals("marks")) {
				newvalue = Integer.parseInt(selectedValue);
				ps.setInt(1, newvalue);
			} else {
				ps.setString(1, selectBY);
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				int age = rs.getInt(4);
				String location = rs.getString(5);
				String gender = rs.getString(6);

				out.println("<h1 styel='color:green'> id : " + id + "\nName : " + name + "\nMarks : " + marks + "\nAge : "
						+ age + "\nLocation : " + location + "\nGender : " + gender + "</h1> ");
				out.println("<a href='index.html'>Go to Home Page </a>");
			}

			ps.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			out.println("<h1 style='color:red'> " + e.getMessage() + "</h1>");
			e.printStackTrace();
		}
		System.out.println("SElect By : " + selectBY);
		System.out.println("Selected value : " + selectedValue);

		out.close();
	}

}
