package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.car;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "car", description = "edit car")
public class CmdEditCar extends AbstractCmd {

    public CmdEditCar() {
        super(CmdAddCar.class, CmdDeleteCar.class, CmdListCar.class, CmdUpdateCar.class);
    }
}
