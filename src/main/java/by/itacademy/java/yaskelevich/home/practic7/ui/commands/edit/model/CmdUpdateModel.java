package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.ModelXMLDaoImpl;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "update", description = "update model")
public class CmdUpdateModel extends AbstractCmd {

    // DB
    // private IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();

    // XML
    private final IDao<Model, List<Model>> dao = ModelXMLDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("input model id for updating:");

        Integer id = 0;
        try {
            id = Integer.valueOf(readInput());
        } catch (final NumberFormatException e) {
            System.err.println("Model id must have integer value");
            return new CmdEditModel();
        }

        final Model model = dao.get(id);
        if (model != null) {
            System.out.println(model);

            System.out.println("input new model name:");
            model.setName(readInput());

            System.out.println("input new brand id:");

            Integer brandId = 0;
            try {
                brandId = Integer.valueOf(readInput());
            } catch (final NumberFormatException e) {
                System.err.println("In Model brand_id must have integer value");
                return new CmdEditModel();
            }
            model.setBrandId(brandId);

            dao.update(model);

            System.out.println("Model updated " + dao.get(id));

            return new CmdEditModel();
        } else {
            System.out.println("Model with id=" + id + " not found");
            return new CmdEditModel();
        }
    }

}