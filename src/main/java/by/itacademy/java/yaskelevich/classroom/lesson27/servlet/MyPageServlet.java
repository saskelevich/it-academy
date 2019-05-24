package by.itacademy.java.yaskelevich.classroom.lesson27.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyPageServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final PrintWriter out = resp.getWriter();
        final HttpSession session = req.getSession(true);
        final String userId = ((String) session.getAttribute("userId"));
        final String user = userId == null ? "unknown user" : userId;
        out.println("Hello: " + user);
    }
}
