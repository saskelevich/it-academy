package by.itacademy.java.yaskelevich.home.practic7.ui;

import by.itacademy.java.yaskelevich.home.practic7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.practic7.ui.commands.CmdHome;

public class Application {

    public static void main(final String[] args) {
        System.out.println("старт программы");

        AbstractCmd nextCommand = new CmdHome();
        while (nextCommand != null) {
            nextCommand = nextCommand.execute();
        }
        System.out.println("конец программы");
        System.exit(0);
    }
}
