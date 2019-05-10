package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand.CmdListBrand;

@Command(name = "add", description = "add model")
public class CmdAddModel extends AbstractCmd {

    private IDao<Model, List<Model>> dao;

    @Override
    public AbstractCmd execute() {

        // DB
        dao = ModelDBDaoImpl.getInstance();

        // XML
//        dao = ModelXMLDaoImpl.getDAOInstance();

        System.out.println("input new model name");
        final String newModelName = readInput();
        final Model model = new Model();
        model.setName(newModelName);

        new CmdListBrand().execute();
        System.out.println("input brand id");
        final Integer id = Integer.valueOf(readInput());
        model.setBrandId(id);

        final Model newEntity = dao.insert(model);

        System.out.println("New model was saved:" + newEntity);

        return new CmdEditModel();
    }
}
