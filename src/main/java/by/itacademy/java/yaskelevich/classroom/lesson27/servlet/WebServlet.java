package by.itacademy.java.yaskelevich.classroom.lesson27.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;

public class WebServlet extends HttpServlet {

    IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final Integer id = Integer.valueOf(req.getParameter("id"));
        final String action = req.getParameter("action");

        if ("delete".equals(action)) {
            try {
                dao.delete(id);
            } catch (final DAOException e) {
                throw new RuntimeException();
            }
            redirectToList(resp);
        } else {
            throw new RuntimeException("operation unsupported");
        }
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final String brandName = req.getParameter("name");
        Integer id = null;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (final NumberFormatException e) {
            // nothing to do
        }
        try {
            if (id == null) {
                final Brand brand = new Brand();
                brand.setName(brandName);
                dao.insert(brand);
            } else {
                final Brand brand = new Brand();
                brand.setName(brandName);
                brand.setId(id);
                dao.update(brand);
            }
            redirectToList(resp);
        } catch (final DAOException e) {
            throw new RuntimeException();
        }
    }

    private void redirectToList(final HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/brands.jsp");
    }
}
