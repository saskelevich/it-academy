package by.itacademy.java.yaskelevich.home.practic7.ui.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;

public class WebModel extends HttpServlet{

	private static final String MODEL_JSP_PATH = "/practic7/update/model/models.jsp";
	private IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
    	Util.doGet(req, resp, dao);
    	Util.redirectToList(resp, MODEL_JSP_PATH);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final String modelName = req.getParameter("name");
        Integer brandId = Integer.valueOf(req.getParameter("brandId"));
        Integer id = null;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (final NumberFormatException e) {
            // nothing to do
        }
            if (id == null) {
                final Model model = new Model();
                model.setName(modelName);
                model.setBrandId(brandId);
                dao.insert(model);
            } else {
                final Model model = new Model();
                model.setName(modelName);
                model.setBrandId(brandId);
                model.setId(id);
                dao.update(model);
            }
            Util.redirectToList(resp, MODEL_JSP_PATH);
    }

	
}
