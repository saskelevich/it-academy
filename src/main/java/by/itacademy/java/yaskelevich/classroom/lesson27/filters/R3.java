package by.itacademy.java.yaskelevich.classroom.lesson27.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class R3 extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final PrintWriter writer = resp.getWriter();
        writer.println("<h1>");
        writer.println("Hello I'm resource 3");
        writer.println("</h1>");
        resp.setContentType("text/plain");
    }

}