package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.brand.CmdEditBrand;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car.CmdEditCar;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model.CmdEditModel;

@Command(name = "edit", description = "edit data base")
public class CmdEditDB extends AbstractCmd {

    public CmdEditDB() {
        super(CmdEditBrand.class, CmdEditModel.class, CmdEditCar.class);
    }
}
