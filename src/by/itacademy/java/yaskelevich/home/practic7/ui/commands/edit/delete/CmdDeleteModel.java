package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.delete;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.CmdEditModel;

@Command(name = "delete", description = "delete model")
public class CmdDeleteModel extends AbstractCmd {

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input model name of delete");
        final String newBrandName = readInput();

        // TODO save into DB (XML)

        System.out.println("model was deleted");

        return new CmdEditModel();
    }
}
