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
 * Servlet implementation class EmailVerify
 */
@WebServlet("/EmailVerify")
public class EmailVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	String email =	request.getParameter("email");

	String url = "jdbc:mysql://localhost:3306/sessions";
	String user = "root";
	String password = "root";
	String query = "select * from details where email = ?";

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connetion =  DriverManager.getConnection(url,user,password);
	PreparedStatement ps= 	connetion.prepareStatement(query);


	ps.setString(1, email);

	ResultSet rs =  ps.executeQuery();
	if(rs.next()) {
		rs.close();
	RequestDispatcher rds =	request.getRequestDispatcher("second.html");
	rds.forward(request, response);
	}else {
		rs.close();
		response.getWriter().println("<h1> Wrong Email</h1>");
		RequestDispatcher rds = request.getRequestDispatcher("first.html");
		rds.include(request, response);
	}

	ps.close();
	connetion.close();
	} catch (Exception e) {
		e.printStackTrace();
		response.getWriter().println("<h1> "+e.getMessage()+"</h1>");
	}




	}

}
