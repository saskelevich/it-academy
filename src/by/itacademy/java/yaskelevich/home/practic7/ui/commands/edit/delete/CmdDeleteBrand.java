package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.delete;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.CmdEditBrand;

@Command(name = "delete", description = "delete brand")
public class CmdDeleteBrand extends AbstractCmd {

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input brand name of delete");
        final String newBrandName = readInput();

        // TODO save into DB (XML)

        System.out.println("brand was deleted");

        return new CmdEditBrand();
    }
}
