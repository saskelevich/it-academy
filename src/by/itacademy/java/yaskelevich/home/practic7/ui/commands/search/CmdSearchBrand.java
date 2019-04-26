package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdHome;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "brand", description = "look for brend")
public class CmdSearchBrand extends AbstractCmd {

    @Override
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {

        System.out.println("search of brand");
        final String string = readInput();
        System.out.println("result: some brand");
        // TODO search into DB (XML)
        if (true) {
            return new CmdSearchModel();
        }
        System.out.println("Not found brand: " + string + ".\nTry again");
        return new CmdHome();
    }
}
