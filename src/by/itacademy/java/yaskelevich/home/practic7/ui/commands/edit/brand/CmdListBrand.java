package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.io.IOException;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.BrandXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListBrand extends AbstractCmd {

    private final IDao dao = BrandXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        final List<Brand> newEntity = dao.getAll();
        for (final Brand brand : newEntity) {
            System.out.println(brand);
        }
        return new CmdEditBrand();
    }
}