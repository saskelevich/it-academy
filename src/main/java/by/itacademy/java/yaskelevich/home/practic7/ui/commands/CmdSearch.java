package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;

@Command(name = "search", description = "look for car")
public class CmdSearch extends AbstractCmd {

	// DB
	private IDao<Brand, Brand> searchBrand = BrandDBDaoImpl.getInstance();
	private IDao<Model, List<Model>> searchModel = ModelDBDaoImpl.getInstance();
	private IDao<Car, List<Car>> searchCar = CarDBDaoImpl.getInstance();

	// XML
//  private IDao<Brand, Brand> searchBrand = BrandXMLDaoImpl.getInstance();
//  private IDao<Model, List<Model>> searchModel = ModelXMLDaoImpl.getInstance();
//  private IDao<Car, List<Car>> searchCar = CarXMLDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		Brand brand = new Brand();
		try {
			brand = selectBrand();
		}catch (NumberFormatException e) {
			System.err.println("Brand id must have integer value");
			return new CmdHome();
		}

		Model model = new Model();
		try {
			model= selectModel(brand);
		}catch (NumberFormatException e) {
			System.err.println("Model id must have integer value");
			return new CmdHome();
		}

		System.out.println("your cars:");
		searchCar.find(model.getId()).stream()
				.forEach(car -> System.out.printf("%s[%d]\n", car.getVin().toUpperCase(), car.getId()));

		return new CmdHome();
	}

	private Model selectModel(final Brand brand) {

		List<Model> models = new ArrayList<Model>();

		models = searchModel.find(brand.getId());
		models.stream().forEach(mdl -> System.out.printf("%s[%d]\n", mdl.getName(), mdl.getId()));

		System.out.println("select model id:");
		final Integer modelId = Integer.valueOf(readInput());
		
		return searchModel.get(modelId);
	}

	private Brand selectBrand() {

		searchBrand.getAll().stream().forEach(brd -> System.out.printf("%s[%d]\n", brd.getName(), brd.getId()));

		System.out.println("select brand id:");

		final Brand brand = searchBrand.find(Integer.valueOf(readInput()));

		return brand;
	}
}
