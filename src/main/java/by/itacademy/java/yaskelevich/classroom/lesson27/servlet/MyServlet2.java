package by.itacademy.java.yaskelevich.classroom.lesson27.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/my_servlet")
public class MyServlet2 extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        // resp.getWriter().println("Hello from Servlet 2 GET");

        // final Cookie cookie = new Cookie("testCookie", "cookievalue");
        // final Cookie cookie1 = new Cookie("testCookie1", "cookievalue1");
        // cookie.setMaxAge(24 * 60 * 60);
        // cookie1.setMaxAge(24 * 60 * 60);
        // resp.addCookie(cookie);
        // resp.addCookie(cookie1);

        final Cookie[] myCookies = req.getCookies();
        for (int i = 0; i < myCookies.length; i++) {
            final Cookie cookie = myCookies[i];
            System.out.println(cookie.getName() + " = " + cookie.getValue());
        }

        resp.setContentType("text/html");
        final PrintWriter out = resp.getWriter();
        out.println("<h1>Hello!</h1>");

        final ServletContext servletCont = getServletContext();
        out.println(servletCont.getInitParameter("mark"));

        final Cookie myCookie = new Cookie("testCookie", "cookieValue");
        myCookie.setMaxAge(24 * 60 * 60);
        resp.addCookie(myCookie);

        final Cookie myCookie2 = new Cookie("testCookie2", "cookieValue2");
        myCookie2.setMaxAge(24 * 60 * 60);
        resp.addCookie(myCookie2);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Hello from Servlet 2 POST");

    }

}
