package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.CarXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete car")
public class CmdDeleteCar extends AbstractCmd {
    private final IDao<Car> dao = CarXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input car id for deleting");
        final Integer id = Integer.parseInt(readInput());
        dao.delete(id);
        System.out.println("car was deleted");
        return new CmdEditCar();
    }
}
