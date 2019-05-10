package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model.CmdListModel;

@Command(name = "add", description = "add car")
public class CmdAddCar extends AbstractCmd {

    private IDao<Car, List<Car>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = CarDBDaoImpl.getInstance();

        // XML
//        dao = CarXMLDaoImpl.getDAOInstance();

        System.out.println("input new car vin:");
        final String newCarVin = readInput();

        final Car car = new Car();
        car.setVin(newCarVin);

        System.out.println("input model id");
        new CmdListModel().execute();
        final Integer id = Integer.valueOf(readInput());
        car.setModelId(id);

        final Car newEntity = dao.insert(car);
        System.out.println("New car was saved:" + newEntity);

        return new CmdEditCar();
    }
}
