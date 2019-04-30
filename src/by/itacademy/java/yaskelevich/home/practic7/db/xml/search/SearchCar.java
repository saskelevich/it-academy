package by.itacademy.java.yaskelevich.home.practic7.db.xml.search;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.CarXmlDaoImpl;

public final class SearchCar implements ISearch<Car, Model> {
    private final IDao<Car> dao;
    private static ISearch<Car, Model> instance;

    {
        dao = CarXmlDaoImpl.getInstance();
    }

    private SearchCar() {
    }

    public static ISearch<Car, Model> getInstance() {
        if (instance == null) {
            instance = new SearchCar();
        }
        return instance;
    }

    @Override
    public List<Car> search(final Model entity) throws FileNotFoundException {
        final List<Car> cars = new ArrayList<Car>();
        dao.getAll().stream().filter(car -> car.getModelId().equals(entity.getId()))
                .forEach(str -> cars.add(str));
        if (cars.size() == 0) {
//            throw new FileNotFoundException("Car vin is not valid");
            System.out.println("Car not found");
        }
        return cars;
    }

}
