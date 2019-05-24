package by.itacademy.java.yaskelevich.classroom.lesson27.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
// @WebServlet("/my_servlet")
public class MyServlet extends HttpServlet {

    // private String message;

    @Override
    public void init() throws ServletException {
        // message = "Hello Jetty";
        final ServletConfig config = getServletConfig();
        System.out.println(config.getInitParameter("initParam"));
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final PrintWriter printWriter = resp.getWriter();
        final ServletContext context = getServletContext();
        printWriter.println(context.getInitParameter("mark"));
        // resp.setContentType("text/html");
        // final PrintWriter out = resp.getWriter();
        // out.println("<h1>" + message + "</h1>");
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        final Map<String, Integer> map = new HashMap<String, Integer>() {

            {
                put("One", 1);
                put("Two", 2);
                put("Three", 3);
            }
        };

        req.setAttribute("map", map);
        req.getRequestDispatcher("test.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        // do nothing
    }
}
