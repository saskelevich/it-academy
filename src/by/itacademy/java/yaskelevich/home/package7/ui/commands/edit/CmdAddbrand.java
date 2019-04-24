package by.itacademy.java.yaskelevich.home.package7.ui.commands.edit;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.package7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.package7.ui.commands.Command;

@Command(name = "add", description = "добавить")
public class CmdAddbrand extends AbstractCmd {

    @Override
    public AbstractCmd execute() throws InstantiationException, IllegalAccessException {
        System.out.println("ввод нового бренда");
        try {
            final String newBrandName = readInput();
        } catch (final IOException e) {
            e.printStackTrace();
        }

        System.out.println("новый бренд сохранен");
        return new CmdEditBrand();
    }
}
