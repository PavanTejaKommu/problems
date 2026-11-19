<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String email = (String) session.getAttribute("email");
    if (email == null) {
        response.sendRedirect("first.html");
        return;
    }
    String safeEmail = email.replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<center>
    <h1>Welcome to Home Page</h1>
    <h2 style="color: green">Login successful</h2>
    <p>Email: <%= safeEmail %></p>
    <p>Password: &bull;&bull;&bull;&bull;&bull;&bull;&bull;&bull;</p>
</center>
</body>
</html>
