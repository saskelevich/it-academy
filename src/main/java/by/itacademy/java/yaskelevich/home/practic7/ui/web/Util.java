package by.itacademy.java.yaskelevich.home.practic7.ui.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.ui.UIException;

public class Util {

	static <T, Y> void doGet(final HttpServletRequest req, final HttpServletResponse resp, IDao<T, Y> dao)
			throws ServletException, IOException {
		final Integer id = Integer.valueOf(req.getParameter("id"));
		final String action = req.getParameter("action");

		if ("delete".equals(action)) {
			dao.delete(id);
		} else {
			throw new RuntimeException("operation unsupported");
		}
	}

	static void redirectToList(final HttpServletResponse resp, String path) throws IOException {
		try{
			resp.sendRedirect(path);
		}catch (IOException e) {
			throw new UIException(path, e);
		}
	}
}
