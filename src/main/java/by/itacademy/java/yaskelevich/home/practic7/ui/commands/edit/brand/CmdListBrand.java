package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "вывести список")
public class CmdListBrand extends AbstractCmd {

    private IDao<Brand, Brand> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = BrandDBDaoImpl.getInstance();

        // XML
//        dao = BrandXMLDaoImpl.getDAOInstance();

        final List<Brand> newEntity = dao.getAll();

        for (final Brand brand : newEntity) {
            System.out.println(brand);
        }
        return new CmdEditBrand();
    }
}