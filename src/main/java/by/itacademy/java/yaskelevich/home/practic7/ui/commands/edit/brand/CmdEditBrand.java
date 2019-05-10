package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "brand", description = "редактировать бренд")
public class CmdEditBrand extends AbstractCmd {

    public CmdEditBrand() {
        super(CmdAddBrand.class, CmdDeleteBrand.class, CmdListBrand.class, CmdUpdateBrand.class);
    }

}