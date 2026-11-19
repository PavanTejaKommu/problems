<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.net.ResponseCache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

<style>
.success {
	color: green;
}

.error {
	color: red;
}

.registration {
	color: blue;
}

.serching {
	color: yellow;
}

body {
	text-align: center;
}
</style>

</head>
<body>


	<form action="Main.jsp" method="post">
		<h1 class="registration">Registration Page</h1>

		<label for="id">Enter Id : </label> <input type="text" name="id"
			placeholder="id"><br> <br> <label for="name">Enter
			Name : </label> <input type="text" name="name" placeholder="name"><br>
		<br> <label for="father">Enter Father name : </label> <input
			type="text" name="father" placeholder="Father Name "><br>
		<br> <label for="mother">Enter Mother Name : </label> <input
			type="text" name="mother" placeholder="Mother Name "><br>
		<br> <label for="age">Enter Age : </label> <input type="text"
			name="age" placeholder="Age"><br> <br> <label
			for="location">Enter Location : </label> <input type="text"
			name="location" placeholder="Location"><br> <br> <label
			for="course">Enter Course : </label> <input type="text" name="course"
			placeholder="Course"><br> <br> <label
			for="duration">Enter Duration : </label> <input type="text"
			name="duration" placeholder="Course Duration"><br> <br>
		<label for="collage">Enter Collage Name : </label> <input type="text"
			name="collage" placeholder="Collage Name"><br> <br>
		<label for="percentage">Enter percentage : </label> <input type="text"
			name="percentage" placeholder="Percentage"><br> <br>
		<label for="phone">Enter Phone Number : </label> <input type="text"
			name="phone" placeholder="Phone Number"><br> <br> <label
			for="email">Enter Email : </label> <input type="email" name="email"
			placeholder="Email"><br> <br> <label for="skills">Enter
			Skills : </label> <input type="text" name="skills" placeholder="Skills"><br>
		<br> <label for="hobies">Enter Hobies : </label> <input
			type="text" name="hobies" placeholder="Hobies"><br> <br>
		<label for="languages">Enter Languages : </label> <input type="text"
			name="languages" placeholder="Languages Konwn"><br> <br>



		<button type="submit" name="action" value="insert">Submit</button>


	</form>
	<br>
	<br>
	<br>
	<hr>
	<form action="Main.jsp" method="get">
		<h1 class="searching">Search Here</h1>
		<label for="gettinData">Enter Id : </label> <input type="text"
			name="gettingData" placeholder="Enter Id ">
		<button type="submit" name="action" value="check">Search</button>

	</form>


	<%
	response.setContentType("text/html");

	String user = "root";
	String password = "root";
	String url = "jdbc:mysql://localhost:3306/student_management";
	String queryGet = "select * from students where  student_id = ?";
	String query = "insert into students values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	if ("insert".equals(request.getParameter("action"))) {
		String idValue = request.getParameter("id");

		if (idValue != null && !idValue.isBlank()) {
			int id = Integer.parseInt(idValue);

			//int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String father = request.getParameter("father");
			String mother = request.getParameter("mother");
			String age = request.getParameter("age");
			String location = request.getParameter("location");
			String course = request.getParameter("course");
			String duration = request.getParameter("duration");
			String collage = request.getParameter("collage");
			String percentage = request.getParameter("percentage");
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");
			String skills = request.getParameter("skills");
			String hobies = request.getParameter("hobies");
			String languages = request.getParameter("languages");

			try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);

		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, father);
		ps.setString(4, mother);
		ps.setString(5, age);
		ps.setString(6, location);
		ps.setString(7, course);
		ps.setString(8, duration);
		ps.setString(9, collage);
		ps.setString(10, percentage);
		ps.setString(11, phone);
		ps.setString(12, email);
		ps.setString(13, skills);
		ps.setString(14, hobies);
		ps.setString(15, languages);
		int rows = ps.executeUpdate();
	%>

	<h1 class="success">Insertion Succesfull</h1>
	<h1><%=rows%>
		Effected
	</h1>
	<%
	ps.close();
	connection.close();

	} catch (Exception e) {
	%>
	<h1 class="error">Error occured at insertion time</h1>
	<h1 class="error"><%=e.getMessage()%></h1>
	<%
	}
	}
	} else if ("check".equals(request.getParameter("action"))) {

	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, password);
	int check = Integer.parseInt(request.getParameter("gettingData"));
	PreparedStatement psg = connection.prepareStatement(queryGet);
	psg.setInt(1, check);
	ResultSet rs = psg.executeQuery();

	if (rs.next()) {
	%>
	<h1>
		Id :
		<%=rs.getInt(1)%></h1>
	<h1><%=rs.getString(2)%></h1>
	<h1><%=rs.getString(3)%></h1>
	<h1><%=rs.getString(4)%></h1>
	<h1><%=rs.getString(5)%></h1>
	<h1><%=rs.getString(6)%></h1>
	<h1><%=rs.getString(7)%></h1>
	<h1><%=rs.getString(8)%></h1>
	<h1><%=rs.getString(9)%></h1>
	<h1><%=rs.getString(10)%></h1>
	<h1><%=rs.getString(11)%></h1>
	<h1><%=rs.getString(12)%></h1>
	<h1><%=rs.getString(13)%></h1>
	<h1><%=rs.getString(14)%></h1>
	<h1><%=rs.getString(15)%></h1>
	<br>
	<br>

	<%
	}
	psg.close();
	rs.close();

	} catch (Exception e) {
	%>
	<h1 class="error">Error occured</h1>
	<h1 class="error"><%=e.getMessage()%></h1>
	<%
	}
	}
	%>
</body>
</html>