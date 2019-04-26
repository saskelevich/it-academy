package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "edit", description = "edit DB")
public class CmdEditDB extends AbstractCmd {

    public CmdEditDB() {
        super(CmdEditBrand.class, CmdEditModel.class);
    }
}
