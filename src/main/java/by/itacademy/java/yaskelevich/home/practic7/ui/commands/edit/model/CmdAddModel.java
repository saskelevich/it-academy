package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.ModelXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand.CmdListBrand;

@Command(name = "add", description = "add model")
public class CmdAddModel extends AbstractCmd {

    // DB
    // private IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();

    // XML
    private final IDao<Model, List<Model>> dao = ModelXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("input new model name");
        final String newModelName = readInput();

        final Model model = new Model();
        model.setName(newModelName);

        new CmdListBrand();
        System.out.println("input brand id:");

        Integer id = 0;
        try {
            id = Integer.valueOf(readInput());
        } catch (final NumberFormatException e) {
            System.err.println("Model id must have integer value");
            return new CmdEditModel();
        }

        model.setBrandId(id);

        final Model newModel = dao.insert(model);

        System.out.println("New model saved:" + newModel);

        return new CmdEditModel();
    }
}