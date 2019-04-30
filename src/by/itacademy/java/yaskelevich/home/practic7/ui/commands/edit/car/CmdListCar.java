package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.io.IOException;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.CarXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListCar extends AbstractCmd {

    private final IDao<Car> dao = CarXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        final List<Car> cars = dao.getAll();
        for (final Car car : cars) {
            System.out.println(car);
        }
        return new CmdEditCar();
    }
}