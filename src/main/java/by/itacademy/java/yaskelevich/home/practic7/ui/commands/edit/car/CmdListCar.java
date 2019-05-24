package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.CarXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "list cars")
public class CmdListCar extends AbstractCmd {

    // DB
    // private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

    // XML
    private final IDao<Car, List<Car>> dao = CarXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        final List<Car> cars = dao.getAll();

        if (cars != null) {
            cars.stream().forEach(car -> System.out.println(car));
        } else {
            System.out.println("List is empty");
        }

        return new CmdEditCar();
    }
}