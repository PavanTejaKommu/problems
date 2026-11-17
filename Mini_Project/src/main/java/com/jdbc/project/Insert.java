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
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends GenericServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see GenericServlet#GenericServlet()
     */
    public Insert() {
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



	try {
		 int id = Integer.parseInt(request.getParameter("id"));
		 String name = request.getParameter("name");
		 int marks = Integer.parseInt(request.getParameter("marks"));
		 int age = Integer.parseInt(request.getParameter("age"));
		 String location = request.getParameter("location");
		 String gender = request.getParameter("gender");

		 String URL = "jdbc:mysql://localhost:3306/miniproject";
		 String user = "root";
		 String password = "root";
		 String query = "insert into students  (id, name, marks, age, location, gender) values(?,?,?,?,?,?)";


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =	 DriverManager.getConnection(URL,user,password);

	PreparedStatement ps= connection.prepareStatement(query);

	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setInt(3, marks);
	ps.setInt(4, age);

	ps.setString(5, location);
	ps.setString(6, gender);
	int rows =ps.executeUpdate();
	out.println("<h1 style='color:green';> "+rows+" Rows  effected </h1>");
	out.println("<a href='index.html'>Go to Home Page </a>");
	ps.close();
	connection.close();

	} catch (Exception e) {

		out.print("<h1 style='color:red';>  "+e.getMessage()+" </h1>");
	}

	out.close();
	}

}
