package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdSearch;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "car", description = "search car")
public class CmdSearchCar extends AbstractCmd {

    private IDao<Brand, Brand> searchBrand;
    private IDao<Model, List<Model>> searchModel;
    private IDao<Car, List<Car>> searchCar;

    @Override
    public AbstractCmd execute() {

        // DB
        searchBrand = BrandDBDaoImpl.getInstance();
        searchModel = ModelDBDaoImpl.getInstance();
        searchCar = CarDBDaoImpl.getInstance();

        // XML
//        searchBrand = BrandXMLDaoImpl.getSearchInstance();
//        searchModel = ModelXMLDaoImpl.getSearchInstance();
//        searchCar = CarXMLDaoImpl.getSearchInstance();

        searchBrand.getAll().stream().forEach(brd -> System.out.println(brd));

        System.out.println("select brand id:");
        Brand brand = new Brand();
        try {
            brand = searchBrand.find(Integer.parseInt(readInput()));

        } catch (final DAOException exception) {

            System.out.println(exception.getMessage() + " Try again");
            return new CmdSearch();
        }

        List<Model> models = new ArrayList<Model>();
        try {

            models = searchModel.find(brand.getId());

        } catch (final DAOException exception) {

            System.out.println(exception.getMessage());

        }
        models.stream().forEach(mdl -> System.out.println(mdl));

        System.out.println("select model id:");
        final Integer modelId = Integer.parseInt(readInput());

        final Model model = new Model();
        models.stream().filter(mdl -> mdl.getId().equals(modelId)).forEach(mdl -> {
            model.setBrandId(mdl.getBrandId());
            model.setCreated(mdl.getCreated());
            model.setId(mdl.getId());
            model.setName(mdl.getName());
            model.setUpdated(mdl.getUpdated());
        });

        System.out.println("your cars:");

        try {
            searchCar.find(model.getId()).stream().forEach(car -> System.out.println(car.getVin()));
        } catch (final DAOException exc) {
            System.out.println(exc.getMessage() + " Try again");
            return new CmdSearch();
        }
        return new CmdSearch();
    }
}
