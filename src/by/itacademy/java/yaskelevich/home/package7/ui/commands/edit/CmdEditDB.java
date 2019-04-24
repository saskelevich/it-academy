package by.itacademy.java.yaskelevich.home.package7.ui.commands.edit;

import by.itacademy.java.yaskelevich.home.package7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.package7.ui.commands.Command;

@Command(name = "edit", description = "изменить бд")
public class CmdEditDB extends AbstractCmd {

    public CmdEditDB() {
        super(CmdEditBrand.class, CmdEditModel.class);
    }
}
