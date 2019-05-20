package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update car")
public class CmdUpdateCar extends AbstractCmd {

	// DB
	private IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();

	// XML
//    private IDao<Car, List<Car>> dao = CarXMLDaoImpl.getDAOInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("input car id for updating:");
		Integer id = 0;
		try {
			id = Integer.valueOf(readInput());
		} catch (NumberFormatException e) {
			System.err.println("Car id must have integer value");
			return new CmdEditCar();
		}

		final Car car = dao.get(id);
		System.out.println(car);

		System.out.println("input new car vin:");
		car.setVin(readInput());

		System.out.println("input new model id:");
		Integer modelId = 0;
		try {
			modelId = Integer.valueOf(readInput());
		} catch (NumberFormatException e) {
			System.err.println("Car model_id must have integer value");
			return new CmdEditCar();
		}
		car.setModelId(modelId);

		dao.update(car);

		System.out.println("Car updated " + dao.get(id));

		return new CmdEditCar();
	}
}