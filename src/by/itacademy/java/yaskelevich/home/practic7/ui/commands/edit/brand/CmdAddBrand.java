package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.BrandXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "add", description = "add brand")
public class CmdAddBrand extends AbstractCmd {

    private final IDao<Brand> dao = BrandXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {

        System.out.println("input new brand name");
        final String newBrandName = readInput();
        final Brand brand = new Brand();
        brand.setName(newBrandName);
        final Brand newEntity = dao.insert(brand);
        System.out.println("New brand was saved:" + newEntity);
        return new CmdEditBrand();
    }
}
