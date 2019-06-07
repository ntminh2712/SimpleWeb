<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2019-06-04
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <form action="/student/register" method="post">
        <div>
            UserName<input type="text" name="username">
        </div>
        <div>
            Password<input type="password" name="password">
        </div>
        <div>
            FullName<input type="text" name="fullname">
        </div>
        <div>
            Email<input type="text" name="email">
        </div>
        <div>
            Address<input type="text" name="address">
        </div>
        <div>
            <input type="submit" value="Submit"></input>
            <input type="reset" value="Reset"></input>
        </div>
    </form>
</body>
</html>
