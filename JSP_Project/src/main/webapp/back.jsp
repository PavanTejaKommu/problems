<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Backend</title>
</head>
<body>
	<%
	response.setContentType("text/html");
	int id = Integer.parseInt(request.getParameter("id"));

	String url = "jdbc:mysql://localhost:3306/jsptemp";
	String user = "root";
	String password = "root";
	String query = "select * from details where id = ?";

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
	%>
	<h1>Got the details</h1>
	<br>
	<br>

	<h1><%=rs.getInt(1)%></h1>
	<h1><%=rs.getString(2)%></h1>
	<h1><%=rs.getInt(3)%></h1>
	<h1><%=rs.getString(4)%></h1>
	<%
	rs.close();
	ps.close();
	connection.close();
	}
	} catch (Exception e) {
	%>
	<h1>Error occured</h1>
	<h1>
		<%=e.getMessage()%></h1>

	<%
	}
	%>

</body>
</html>