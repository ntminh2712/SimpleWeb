<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2019-06-06
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
<form action="student/login" method="post">
    <div>
        UserName <input type="text" name="username">
    </div>
    <div>
        Password <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="Login"></input>
        <input type="reset" value="Reset"></input>
    </div>
</form>
</body>
</html>
