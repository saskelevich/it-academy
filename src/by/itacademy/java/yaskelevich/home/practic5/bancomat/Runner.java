package by.itacademy.java.yaskelevich.home.practic5.bancomat;

import by.itacademy.java.yaskelevich.home.practic5.bancomat.account.Account;
import by.itacademy.java.yaskelevich.home.practic5.bancomat.display.Display;
import by.itacademy.java.yaskelevich.home.practic5.bancomat.keyboard.Input;

public class Runner {
    final private static Input in = new Input();
    private static int i = -1;
    final public static Account account = new Account();

    public static void main(final String[] args) {

        Display.start();
        Display.pushCard();
        if (in.pushCard()) {
            mainMenu();
        } else {
            Display.exit();
        }
    }

    private static void mainMenu() {

        do {

            switch (i) {
            case Input.BALANCE:
                Display.lookBalance(account.toString());
                break;
            case Input.INPUT:
                Display.input();
                account.inPut(in.inPut());
                Display.actionFinish();
                break;
            case Input.OUTPUT:
                Display.output();
                account.outPut(in.outPut());
                Display.actionFinish();
                break;
            default:
                break;
            }
            Display.mainWindow();
        }
        while ((i = in.mainMenu()) != Input.EXIT);
        Display.exit();

    }

}