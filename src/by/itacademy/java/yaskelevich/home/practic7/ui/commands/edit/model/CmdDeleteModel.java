package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete model")
public class CmdDeleteModel extends AbstractCmd {

    private IDao<Model, List<Model>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = ModelDBDaoImpl.getInstance();

        // XML
//        dao = ModelXMLDaoImpl.getDAOInstance();

        System.out.println("input model id for deleting");
        final Integer id = Integer.parseInt(readInput());
        dao.delete(id);
        System.out.println("brand was delete");
        return new CmdEditModel();
    }
}
