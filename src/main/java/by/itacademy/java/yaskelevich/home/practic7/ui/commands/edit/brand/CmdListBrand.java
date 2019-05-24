package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.BrandXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "list brands")
public class CmdListBrand extends AbstractCmd {

    // DB
    // private IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();

    // XML
    private final IDao<Brand, Brand> dao = BrandXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        final List<Brand> brands = dao.getAll();

        if (brands != null) {
            brands.stream().forEach(brand -> System.out.println(brand));
        } else {
            System.out.println("List is empty");
        }

        return new CmdEditBrand();
    }
}