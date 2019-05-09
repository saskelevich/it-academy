package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.CmdEditDB;

@Command(name = "home", description = "return to main menu")
public class CmdHome extends AbstractCmd {

    public CmdHome() {
        super(CmdEditDB.class, CmdSearch.class, CmdExit.class);
    }
}