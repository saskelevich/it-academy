package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListCar extends AbstractCmd {

    private IDao<Car, List<Car>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = CarDBDaoImpl.getInstance();

        // XML
//        dao = CarXMLDaoImpl.getDAOInstance();

        final List<Car> cars = dao.getAll();
        for (final Car car : cars) {
            System.out.println(car);
        }
        return new CmdEditCar();
    }
}