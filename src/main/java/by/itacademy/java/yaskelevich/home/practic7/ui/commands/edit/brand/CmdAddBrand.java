package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "add", description = "добавить бренд")
public class CmdAddBrand extends AbstractCmd {
	
	// DB
    private IDao<Brand, Brand> dao= BrandDBDaoImpl.getInstance();
    
    // XML
//  private IDao<Brand, Brand> dao = BrandXMLDaoImpl.getDAOInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("input new brand name");
        final String newBrandName = readInput();

        final Brand brand = new Brand();
        brand.setName(newBrandName);

        final Brand newEntity = dao.insert(brand);

        System.out.println("Новый бренд сохранен:" + newEntity);
        return new CmdEditBrand();
    }
}
