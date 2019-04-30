package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.BrandXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update btand")
public class CmdUpdateBrand extends AbstractCmd {
    private final IDao<Brand> dao = BrandXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input brand id for updating");
        final Integer id = Integer.valueOf(readInput());
        System.out.println("input new brand name:");
        final String newNane = readInput();
        final Brand brand = new Brand();
        brand.setId(id);
        brand.setName(newNane);
        dao.update(brand);
        System.out.println("Brand with id=" + id + " was updated");
        return new CmdEditBrand();
    }

}
