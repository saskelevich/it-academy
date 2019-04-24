package by.itacademy.java.yaskelevich.home.package7.ui.commands;

import by.itacademy.java.yaskelevich.home.package7.ui.commands.edit.CmdEditDB;
import by.itacademy.java.yaskelevich.home.package7.ui.commands.search.CmdSearch;

@Command(name = "home", description = "вернутся в главное меню")
public class CmdHome extends AbstractCmd {

    public CmdHome() {
        super(CmdEditDB.class, CmdSearch.class);
    }
}
