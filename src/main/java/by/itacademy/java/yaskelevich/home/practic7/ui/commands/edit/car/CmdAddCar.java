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
	
	// DB
	private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

	// XML
//   private IDao<Car, List<Car>> dao = CarXMLDaoImpl.getDAOInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("input new car vin:");
		final String newCarVin = readInput();

		final Car car = new Car();
		car.setVin(newCarVin);

		new CmdListModel().execute();
		System.out.println("input model id");
		Integer id = 0;
		try {
			id = Integer.valueOf(readInput());
		} catch (NumberFormatException e) {
			System.err.println("car model_id must have integer value");
			return new CmdEditCar();
		}
		car.setModelId(id);

		final Car newEntity = dao.insert(car);
		System.out.println("New car saved: " + newEntity);

		return new CmdEditCar();
	}
}
