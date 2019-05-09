package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete car")
public class CmdDeleteCar extends AbstractCmd {

    private IDao<Car, List<Car>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = CarDBDaoImpl.getInstance();

        // XML
//        dao = CarXMLDaoImpl.getDAOInstance();

        System.out.println("input car id for deleting");
        final Integer id = Integer.parseInt(readInput());
        dao.delete(id);
        System.out.println("car was deleted");
        return new CmdEditCar();
    }
}
