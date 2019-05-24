package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.BrandXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update brand")
public class CmdUpdateBrand extends AbstractCmd {

    // DB
    // private IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();

    // XML
    private final IDao<Brand, Brand> dao = BrandXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("input brand id for edit:");
        Integer id = 0;

        try {
            id = Integer.valueOf(readInput());
        } catch (final NumberFormatException e) {
            System.err.println("Brand id must have integer value");
            return new CmdEditBrand();
        }

        final Brand brand = dao.get(id);
        if (brand != null) {

            System.out.println(brand);

            System.out.println("input new brand name:");
            brand.setName(readInput());
            dao.update(brand);

            System.out.println("Brand updated:" + dao.get(id));
            return new CmdEditBrand();
        } else {
            System.out.println("Brand with id=" + id + " not found");
            return new CmdEditBrand();
        }
    }
}