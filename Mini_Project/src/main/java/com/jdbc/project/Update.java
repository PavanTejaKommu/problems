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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public Update() {
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

		String selectValue = request.getParameter("selectValue");
		String updatedValue = request.getParameter("updatedValue");

		String selectBY = request.getParameter("selectBy");
		String updateValue = request.getParameter("updateValue");

		String URL = "jdbc:mysql://localhost:3306/miniproject";
		String user = "root";
		String password = "root";

		String query = "UPDATE students SET " + updateValue + " = ? WHERE " + selectBY + " = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, user, password);
			PreparedStatement ps = connection.prepareStatement(query);

			switch (selectBY) {
			case "Id": {
				int idToFind = Integer.parseInt(selectValue);
				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);
					ps.setInt(1, newValue);
					ps.setInt(2, idToFind);
				} else {
					ps.setString(1, updatedValue);
					ps.setInt(2, idToFind);

				}

				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;'>" + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			case "Name": {

				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);

					ps.setInt(1, newValue);
					ps.setString(2, selectValue);
				} else {
					ps.setString(1, updatedValue);
					ps.setString(2, selectValue);
				}

				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;'> " + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			case "Age": {
				int idToFind = Integer.parseInt(selectValue);
				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);
					ps.setInt(1, newValue);
					ps.setInt(2, idToFind);
				} else {
					ps.setString(1, updatedValue);
					ps.setInt(2, idToFind);

				}
				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;' " + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			case "Marks": {
				int idToFind = Integer.parseInt(selectValue);
				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);
					ps.setInt(1, newValue);
					ps.setInt(2, idToFind);
				} else {
					ps.setString(1, updatedValue);
					ps.setInt(2, idToFind);

				}
				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;'>  " + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			case "Location": {

				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);

					ps.setInt(1, newValue);
					ps.setString(2, selectValue);
				} else {
					ps.setString(1, updatedValue);
					ps.setString(2, selectValue);
				}

				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;'> " + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			case "Gender": {

				int newValue = 0;
				if (updateValue.equals("id") || updateValue.equals("age") || updateValue.equals("marks")) {

					newValue = Integer.parseInt(updatedValue);

					ps.setInt(1, newValue);
					ps.setString(2, selectValue);
				} else {
					ps.setString(1, updatedValue);
					ps.setString(2, selectValue);
				}

				int rows = ps.executeUpdate();
				out.println("<h1 style='color : green;'> " + rows + " rows effected Updated succesfully</h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
				break;
			}
			default:
				out.println("<h1 style='color : red >Invalid input </h1>");
				out.println("<a href='index.html'>Go to Home Page </a>");
			}

			ps.close();
			connection.close();
		} catch (Exception e) {

			out.println("<h1 styel='color:red';> " + e.getMessage() + "</h1>");
			out.println("<a href='index.html'>Go to Home Page </a>");
		}

		out.close();
	}

}

/**
 *
 * System.out.println("selectValue : " + selectValue);
 * System.out.println("updatedValue : " + updatedValue);
 * System.out.println("select By : " + selectBY);
 * System.out.println("updateValue : " + updateValue); System.out.println("query
 * : " + query);
 *
 *
 * System.out.println("Query : "+query);
 *
 */
