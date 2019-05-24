package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.CarXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete car")
public class CmdDeleteCar extends AbstractCmd {

    // DB
    // private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

    // XML
    private final IDao<Car, List<Car>> dao = CarXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("input car id for deleting");

        Integer id = 0;
        try {
            id = Integer.parseInt(readInput());
        } catch (final NumberFormatException e) {
            System.err.println("Car id must have integer value");
            return new CmdEditCar();
        }

        dao.delete(id);
        System.out.println("car deleted");
        return new CmdEditCar();
    }
}