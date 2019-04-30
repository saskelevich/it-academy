package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.ModelXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "delete", description = "delete model")
public class CmdDeleteModel extends AbstractCmd {
    private final IDao<Model> dao = ModelXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input model id for deleting");
        final Integer id = Integer.parseInt(readInput());
        dao.delete(id);
        System.out.println("brand was delete");
        return new CmdEditModel();
    }
}
