package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.add.CmdAddModel;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.delete.CmdDeleteModel;

@Command(name = "model", description = "edit model")
public class CmdEditModel extends AbstractCmd {

    public CmdEditModel() {
        super(CmdAddModel.class, CmdDeleteModel.class);
    }
}
