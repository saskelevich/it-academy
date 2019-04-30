package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "brand", description = "edit brand")
public class CmdEditBrand extends AbstractCmd {

    public CmdEditBrand() {
        super(CmdListBrand.class, CmdAddBrand.class, CmdDeleteBrand.class, CmdUpdateBrand.class);
    }
}
