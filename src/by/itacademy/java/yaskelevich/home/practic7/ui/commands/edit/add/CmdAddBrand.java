package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.add;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.CmdEditBrand;

@Command(name = "add", description = "add brand")
public class CmdAddBrand extends AbstractCmd {

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("input new brand");
        final String newBrandName = readInput();

        // TODO save into DB (XML)

        System.out.println("new brand was saved");

        return new CmdEditBrand();
    }
}
