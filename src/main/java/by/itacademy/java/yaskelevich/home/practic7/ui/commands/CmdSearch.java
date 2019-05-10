package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.search.CmdSearchBrand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.search.CmdSearchCar;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.search.CmdSearchModel;

@Command(name = "search", description = "look for car")
public class CmdSearch extends AbstractCmd {

    public CmdSearch() {
        super(CmdSearchBrand.class, CmdSearchModel.class, CmdSearchCar.class);
    }

}
