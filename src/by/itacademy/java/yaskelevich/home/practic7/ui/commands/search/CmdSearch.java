package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import java.io.IOException;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.search.ISearch;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.search.SearchBrand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.search.SearchCar;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.search.SearchModel;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdHome;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand.CmdListBrand;

@Command(name = "search", description = "look for car")
public class CmdSearch extends AbstractCmd {

    private final ISearch<Brand, String> searchBrand = SearchBrand.getInstance();
    private final ISearch<Car, Model> searchCar = SearchCar.getInstance();
    private final ISearch<Model, Brand> searchModel = SearchModel.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {

        new CmdListBrand().execute();
        System.out.println("select brand name:");
        final Brand brand = searchBrand.search(readInput()).get(0);

        final List<Model> models = searchModel.search(brand);
        models.stream().forEach(str -> System.out.println(str));
        System.out.println("select model name:");
        final Model model = new Model();
        model.setName(readInput());
        model.setBrandId(brand.getId());

        System.out.println("your cars:");
        final List<Car> cars = searchCar.search(getModel(model, models));
        cars.stream().forEach(str -> System.out.println(str));
        return new CmdHome();
    }

    public Model getModel(final Model model, final List<Model> list) {
        for (final Model model2 : list) {
            if (model2.getBrandId().equals(model.getBrandId())
                    && model2.getName().equalsIgnoreCase(model.getName())) {
                return model2;
            }
        }
        return null;
    }

}
