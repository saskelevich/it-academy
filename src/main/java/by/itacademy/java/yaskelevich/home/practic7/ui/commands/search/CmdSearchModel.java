package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdSearch;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "model", description = "search model")
public class CmdSearchModel extends AbstractCmd {

    private IDao<Brand, Brand> searchBrand;
    private IDao<Model, List<Model>> searchModel;

    @Override
    public AbstractCmd execute() {

        // DB
        searchModel = ModelDBDaoImpl.getInstance();
        searchBrand = BrandDBDaoImpl.getInstance();

        // XML
//        searchBrand = BrandXMLDaoImpl.getSearchInstance();
//        searchModel = ModelXMLDaoImpl.getSearchInstance();

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

        return new CmdSearch();
    }
}
