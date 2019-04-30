package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.ModelXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update model")
public class CmdUpdateModel extends AbstractCmd {
    private final IDao<Model> dao = ModelXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input id of model for update:");
        final Model model = new Model();
        model.setId(Integer.valueOf(readInput()));
        System.out.println("input new model name:");
        model.setName(readInput());
        System.out.println("input new brand id");
        model.setBrandId(Integer.valueOf(readInput()));
        dao.update(model);
        System.out.println("Model with id=" + model.getId() + " was update");
        return new CmdEditModel();
    }

}