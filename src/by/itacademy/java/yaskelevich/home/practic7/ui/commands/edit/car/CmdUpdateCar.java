package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update car")
public class CmdUpdateCar extends AbstractCmd {

    private IDao<Car, List<Car>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = CarDBDaoImpl.getInstance();

        // XML
//        dao = CarXMLDaoImpl.getDAOInstance();

        System.out.println("input car id for update:");
        final Integer id = Integer.parseInt(readInput());

        final Car car = dao.get(id);
        System.out.println(car);

        System.out.println("input new car vin:");
        car.setVin(readInput());

        System.out.println("input new model id:");
        car.setModelId(Integer.valueOf(readInput()));

        dao.update(car);

        System.out.println("Car with id=" + dao.get(id) + " was update");

        return new CmdEditCar();
    }
}