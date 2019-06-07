package simpleweb.controller;

import simpleweb.entity.Student;
import simpleweb.model.StudentModel;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloController extends HttpServlet {
    private StudentModel model = new StudentModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", model.getList());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
