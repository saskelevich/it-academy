package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.io.IOException;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.ModelXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "list", description = "output list")
public class CmdListModel extends AbstractCmd {

    private final IDao<Model> dao = ModelXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        final List<Model> newEntity = dao.getAll();
        for (final Model model : newEntity) {
            System.out.println(model);
        }
        return new CmdEditModel();
    }
}
