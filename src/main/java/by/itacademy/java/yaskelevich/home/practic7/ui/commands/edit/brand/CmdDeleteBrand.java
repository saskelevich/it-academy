package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "удалить бренд")
public class CmdDeleteBrand extends AbstractCmd {

	// DB
	private IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();

	// XML
//    private IDao<Brand, Brand> dao = BrandXMLDaoImpl.getDAOInstance();
	
	@Override
    public AbstractCmd execute() {

        System.out.println("введите id для удаления нового бренда");
        
        Integer id = 0;
        
        try {
        	id = Integer.valueOf(readInput());
        }catch (NumberFormatException e) {
        	System.err.println("Brand id must have integer value");
        	return new CmdEditBrand();
		}

        dao.delete(id);

        System.out.println("бренд удален");
        return new CmdEditBrand();
    }
}
