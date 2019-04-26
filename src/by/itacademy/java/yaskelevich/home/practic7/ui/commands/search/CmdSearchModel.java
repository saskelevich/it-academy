package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdHome;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "model", description = "look for model")
public class CmdSearchModel extends AbstractCmd {

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {

        System.out.println("search of model");
        final String string = readInput();
        // TODO search into DB (XML)
        System.out.println("result: some model");
        // TODO add new branch
        return new CmdHome();
    }
}
