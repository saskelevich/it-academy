package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "удалить бренд")
public class CmdDeleteBrand extends AbstractCmd {

    private IDao<Brand, Brand> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = BrandDBDaoImpl.getInstance();

        // XML
//        dao = BrandXMLDaoImpl.getDAOInstance();

        System.out.println("введите id для удаления нового бренда");
        final Integer id = Integer.parseInt(readInput());

        dao.delete(id);

        System.out.println("бренд удален");
        return new CmdEditBrand();
    }
}
