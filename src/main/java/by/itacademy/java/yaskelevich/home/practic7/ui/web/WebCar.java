package by.itacademy.java.yaskelevich.home.practic7.ui.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;

public class WebCar extends HttpServlet{

	private static final String CAR_JSP_PATH = "/practic7/update/car/cars.jsp";
	private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
    	Util.doGet(req, resp, dao);
    	Util.redirectToList(resp, CAR_JSP_PATH);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        final String vin = req.getParameter("vin");
        Integer modelId = Integer.valueOf(req.getParameter("modelId"));
        Integer id = null;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (final NumberFormatException e) {
            // nothing to do
        }
            if (id == null) {
                final Car car = new Car();
                car.setVin(vin);
                car.setModelId(modelId);
                dao.insert(car);
            } else {
                final Car car = new Car();
                car.setVin(vin);
                car.setModelId(modelId);
                car.setId(id);
                dao.update(car);
            }
            Util.redirectToList(resp, CAR_JSP_PATH);
    }
}