package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.BrandXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete brand")
public class CmdDeleteBrand extends AbstractCmd {
    private final IDao<Brand> dao = BrandXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {

        System.out.println("input brand id for deleting");
        final Integer id = Integer.parseInt(readInput());
        dao.delete(id);
        System.out.println("brand was deleted");
        return new CmdEditBrand();
    }
}
