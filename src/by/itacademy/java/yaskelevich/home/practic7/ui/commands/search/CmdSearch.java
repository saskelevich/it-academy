package by.itacademy.java.yaskelevich.home.practic7.ui.commands.search;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "search", description = "look for car")
public class CmdSearch extends AbstractCmd {

    public CmdSearch() {
        super(CmdSearchBrand.class);
    }

}
