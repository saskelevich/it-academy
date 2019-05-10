package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListModel extends AbstractCmd {

    private IDao<Model, List<Model>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = ModelDBDaoImpl.getInstance();

        // XML
//        dao = ModelXMLDaoImpl.getDAOInstance();

        final List<Model> newEntity = dao.getAll();
        for (final Model model : newEntity) {
            System.out.println(model);
        }
        return new CmdEditModel();
    }
}
