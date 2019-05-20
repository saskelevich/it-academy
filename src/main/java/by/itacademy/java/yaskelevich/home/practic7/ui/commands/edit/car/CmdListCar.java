package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListCar extends AbstractCmd {
	
	// DB
	private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

	// XML
//	private IDao<Car, List<Car>> dao = CarXMLDaoImpl.getDAOInstance();

	@Override
	public AbstractCmd execute() {

		dao.getAll().stream().forEach(car -> System.out.println(car));
		return new CmdEditCar();
	}
}