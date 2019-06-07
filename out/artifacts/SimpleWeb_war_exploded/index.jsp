<%@ page import="java.util.ArrayList" %>
<%@ page import="simpleweb.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2019-06-04
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  ArrayList<Student> list = (ArrayList<Student>)request.getAttribute("list");
  if (list == null){
      list = new ArrayList<>();
  }
%>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h2>Hello</h2>
  <ul>
      <%
        for (int i = 0; i < list.size(); i++) {
      %>

      <li><%= list.get(i).getName() %></li>
      <%

        }
      %>
  </ul>

  </body>
</html>
