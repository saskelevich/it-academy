package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.DAOException;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdSearch;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "brand", description = "search brand")
public class CmdSearchBrand extends AbstractCmd {

    private IDao<Brand, Brand> searchBrand;

    @Override
    public AbstractCmd execute() {

        // XML
//        searchBrand = BrandXMLDaoImpl.getSearchInstance();
        // DB
        searchBrand = BrandDBDaoImpl.getInstance();

        searchBrand.getAll().stream().forEach(brd -> System.out.println(brd));

        System.out.println("select brand id:");
        Brand brand = new Brand();
        try {
            brand = searchBrand.find(Integer.parseInt(readInput()));

        } catch (final DAOException exception) {

            System.out.println(exception.getMessage() + " Try again");
            return new CmdSearch();
        }
        System.out.println(brand);

        return new CmdSearch();
    }
}
