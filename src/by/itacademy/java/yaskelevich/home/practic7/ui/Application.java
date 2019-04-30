package by.itacademy.java.yaskelevich.home.practic7.ui;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdHome;

public class Application {

    public static void main(final String[] args)
            throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("start application");

        AbstractCmd nextCommand = new CmdHome();
        while (nextCommand != null) {
            nextCommand = nextCommand.execute();
        }

        System.out.println("exit");
        System.exit(0);
    }
}
