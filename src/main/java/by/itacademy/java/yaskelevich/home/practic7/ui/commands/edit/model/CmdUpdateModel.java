package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update model")
public class CmdUpdateModel extends AbstractCmd {

    private IDao<Model, List<Model>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = ModelDBDaoImpl.getInstance();

        // XML
//        dao = ModelXMLDaoImpl.getDAOInstance();

        System.out.println("input id of model for update:");
        final Integer id = Integer.parseInt(readInput());

        final Model model = dao.get(id);
        System.out.println(model);

        System.out.println("input new model name");
        model.setName(readInput());

        System.out.println("input new brand id");
        model.setBrandId(Integer.valueOf(readInput()));

        dao.update(model);

        System.out.println("Model with id=" + dao.get(id) + " was update");

        return new CmdEditModel();
//        System.out.println("input id of model for update:");
//        final Model model = new Model();
//        model.setId(Integer.valueOf(readInput()));
//        System.out.println("input new model name:");
//        model.setName(readInput());
//        System.out.println("input new brand id");
//        model.setBrandId(Integer.valueOf(readInput()));
//        dao.update(model);
//        System.out.println("Model with id=" + model.getId() + " was update");
//        return new CmdEditModel();
    }

}