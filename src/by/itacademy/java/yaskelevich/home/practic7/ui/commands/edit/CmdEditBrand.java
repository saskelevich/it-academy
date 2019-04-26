package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.add.CmdAddBrand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.delete.CmdDeleteBrand;

@Command(name = "brand", description = "edit brand")
public class CmdEditBrand extends AbstractCmd {

    public CmdEditBrand() {
        super(CmdAddBrand.class, CmdDeleteBrand.class);
    }
}
