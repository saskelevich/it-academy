package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "вывести список")
public class CmdListBrand extends AbstractCmd {
	
	// DB
	private IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();
	
	// XML
//    private IDao<Brand, Brand> dao =BrandXMLDaoImpl.getDAOInstance();
	
	@Override
	public AbstractCmd execute() {

//		final List<Brand> newEntity = dao.getAll();
//
//		for (final Brand brand : newEntity) {
//			System.out.println(brand);
//		}
		dao.getAll().stream().forEach(brand -> System.out.println(brand));
		return new CmdEditBrand();
	}
}