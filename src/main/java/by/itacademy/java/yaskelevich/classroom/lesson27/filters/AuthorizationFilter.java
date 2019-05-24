package by.itacademy.java.yaskelevich.classroom.lesson27.filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationFilter implements Filter {
    private final Map<String, User> USER_DB = new HashMap<>();

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        final User basic = new User();
        basic.setPassword("basicpassword");
        basic.getAllowedResource().add("/r1");

        final User admin = new User();
        final List<String> paths = Arrays.asList("/r1", "/r2", "/r3", "/r4");
        admin.getAllowedResource().addAll(paths);
        basic.setPassword("adminpassword");
        USER_DB.put("admin", admin);
        USER_DB.put("basic", basic);
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        final HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        final String authHeader = httpServletRequest.getHeader("Authorization");
        if (authHeader == null) {
            send401(httpServletResponse, "Authorization header is missing");
            return;
        }
        final String[] authHeaderValues = authHeader.split(" ");
        if (authHeaderValues == null || authHeaderValues.length != 2) {
            send401(httpServletResponse, "Something wrong with header content");
            return;
        }

        final String authScheme = authHeaderValues[0];
        final String credString = authHeaderValues[1];
        if (!authScheme.equalsIgnoreCase("Basic")) {
            send401(httpServletResponse, "unsupported authorization scheme");
            return;
        }
        final String credentials = new String(Base64.getDecoder().decode(credString), "UTF-8");
        final String[] userAndPass = credentials.split(":");
        if (userAndPass == null || userAndPass.length != 2) {
            send401(httpServletResponse, "something wrong with decoded token");
            return;
        }
        final String login = userAndPass[0];
        final String password = userAndPass[1];

        final User user = USER_DB.get(login);
        if (user == null) {
            send401(httpServletResponse, "unknown usernam");
            return;
        }
        if (!user.getPassword().equalsIgnoreCase(password)) {
            send401(httpServletResponse, "invalid password");
            return;
        }
        final List<String> allowedResources = user.getAllowedResource();
        final String currentPath = ((HttpServletRequest) request).getRequestURI();
        if (!allowedResources.contains(currentPath)) {
            send403(httpServletResponse);
            return;
        }
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }

    private void send401(final HttpServletResponse response, final String message) throws IOException {
        response.setHeader("WWW-Authenticate", "Basic realm=test");
        response.sendError(401, message);
    }

    private void send403(final HttpServletResponse response) throws IOException {
        response.sendError(403);
    }
}
