package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.ModelXmlDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand.CmdListBrand;

@Command(name = "add", description = "add model")
public class CmdAddModel extends AbstractCmd {

    private final IDao<Model> dao = ModelXmlDaoImpl.getInstance();

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input new model name");
        final String newModelName = readInput();
        final Model model = new Model();
        model.setName(newModelName);
        System.out.println("input brand id");
        new CmdListBrand().execute();
        final Integer id = Integer.valueOf(readInput());
        model.setBrandId(id);
        final Model newEntity = dao.insert(model);
        System.out.println("New model was saved:" + newEntity);
        return new CmdEditModel();
    }
}
