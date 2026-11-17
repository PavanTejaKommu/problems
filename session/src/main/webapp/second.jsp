<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Enter password</title>
</head>
<body>
    <main>
        <h1>Email verified successfully</h1>
        <p>Enter the password for ${param.email}.</p>

        <form action="${pageContext.request.contextPath}/PasswordVerify" method="post">
            <input type="hidden" name="email" value="${param.email}">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit">Check</button>
        </form>
    </main>
</body>
</html>
