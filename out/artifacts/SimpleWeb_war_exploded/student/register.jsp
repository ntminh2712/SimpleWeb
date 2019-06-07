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
            RollNumber<input type="text" name="rollNumber">
        </div>
        <div>
            Name<input type="text" name="name">
        </div>
        <div>
            <input type="submit" value="Submit"></input>
            <input type="reset" value="Reset"></input>
        </div>
    </form>
</body>
</html>
