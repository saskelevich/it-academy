package by.itacademy.java.yaskelevich.classroom.lesson27.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        final PrintWriter writer = resp.getWriter();

        final String info = req.getHeader("Referer");
        String color = "green";
        if (info.toLowerCase().endsWith(("/form-sample1.html".toLowerCase()))) {
            color = "blue";
        }

        resp.getWriter().println("<html>");
        resp.getWriter().println("<body>");
        resp.getWriter().println(
                String.format("<table border=\"1px solid black\" style=\"background-color:%s; color: white\">", color));
        resp.getWriter().println("<tr>");
        resp.getWriter().println("<th>key</th>");
        resp.getWriter().println("<th>value</th>");
        resp.getWriter().println("</tr>");

        final Enumeration<String> params = req.getParameterNames();
        while (params.hasMoreElements()) {

            final String string = params.nextElement();
            resp.getWriter().println("<tr>");
            resp.getWriter().println("<td>" + string + "</td>");
            resp.getWriter().println("<td>" + req.getParameter(string) + "</td>");
            resp.getWriter().println("</tr>");

        }

        resp.getWriter().println("</table>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
        resp.setContentType("text/html");

    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final String name = req.getParameter("firstName");
        resp.setContentType("text/xml");
        resp.getWriter().println("Hello " + name);
    }

}
