package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.CarXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model.CmdListModel;

@Command(name = "add", description = "add car")
public class CmdAddCar extends AbstractCmd {

    private final IDao<Car> dao = CarXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
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
