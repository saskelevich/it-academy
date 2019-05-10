package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "edit", description = "редакатировать бренд")
public class CmdUpdateBrand extends AbstractCmd {

    private IDao<Brand, Brand> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = BrandDBDaoImpl.getInstance();

        // XML
//        dao = BrandXMLDaoImpl.getDAOInstance();

        System.out.println("введите id бренда для редактирования ");
        final Integer id = Integer.parseInt(readInput());

        final Brand brand = dao.get(id);
        System.out.println(brand);

        System.out.println("введите новое имя");
        brand.setName(readInput());
        dao.update(brand);

        System.out.println("бренд обновлен:" + dao.get(id));
        return new CmdEditBrand();
    }
}