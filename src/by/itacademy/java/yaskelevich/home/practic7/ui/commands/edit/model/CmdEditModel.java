package by.itacademy.java.yaskelevich.home.practic7.ui.commands.edit.model;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.Command;

@Command(name = "model", description = "edit model")
public class CmdEditModel extends AbstractCmd {

    public CmdEditModel() {
        super(CmdListModel.class, CmdAddModel.class, CmdDeleteModel.class, CmdUpdateModel.class);
    }
}
