package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListModel extends AbstractCmd {

	// DB
	private IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();

	// XML
//    private IDao<Model, List<Model>> dao = ModelXMLDaoImpl.getDAOInstance();
	
	@Override
	public AbstractCmd execute() {

		dao.getAll().stream().forEach(model -> System.out.println(model));
		return new CmdEditModel();
	}
}
