package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.CarXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update car")
public class CmdUpdateCar extends AbstractCmd {
    private final IDao<Car> dao = CarXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input car id for update:");
        final Car car = new Car();
        car.setId(Integer.valueOf(readInput()));
        System.out.println("input new car vin:");
        car.setVin(readInput());
        System.out.println("input new model id:");
        car.setModelId(Integer.valueOf(readInput()));
        dao.update(car);
        System.out.println("Car with id=" + car.getId() + " was update");
        return new CmdEditCar();
    }
}