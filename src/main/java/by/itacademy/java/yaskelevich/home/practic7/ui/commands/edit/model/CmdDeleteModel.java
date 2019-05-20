package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete model")
public class CmdDeleteModel extends AbstractCmd {
	
	// DB
	private IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();
	
	// XML
//	private IDao<Model, List<Model>> dao = ModelXMLDaoImpl.getDAOInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("input model id for deleting");
		
		Integer id = 0;
		try {
			id = Integer.valueOf(readInput());
		}catch (NumberFormatException e) {
			System.err.println("Model id must have integer value");
			return new CmdEditModel();
		}
		
		dao.delete(id);
		
		System.out.println("brand was delete");
		return new CmdEditModel();
	}
}
