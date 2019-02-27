package by.itacademy.java.yaskelevich.home.practic5.bancomat.keyboard;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic5.bancomat.Runner;
import by.itacademy.java.yaskelevich.home.practic5.bancomat.box.CashBox;
import by.itacademy.java.yaskelevich.home.practic5.bancomat.display.Display;

public class Input {
    private static final String YES = "Y";
    private static final String NO = "N";
    public static final int EXIT = 3;
    public static final int BALANCE = 0;
    public static final int INPUT = 1;
    public static final int OUTPUT = 2;

    private final Scanner in = new Scanner(System.in);

    public boolean pushCard() {
        final String answer = in.next();
        if (answer.compareToIgnoreCase(YES) == 0) {
            return true;
        }
        if (answer.compareToIgnoreCase(NO) == 0) {
            return false;
        } else {
            Display.tryAgain();
            Display.pushCard();
            return pushCard();
        }
    }

    public int mainMenu() {
        final String str = in.next();
        final int answer = Validator.isNumber(str) ? Integer.parseInt(str) : -1;
        switch (answer) {
        case BALANCE:
            return BALANCE;
        case INPUT:
            return INPUT;
        case OUTPUT:
            return OUTPUT;
        case EXIT:
            return EXIT;
        default:
            Display.tryAgain();
            return mainMenu();
        }

    }

    public double inPut() {
        final String str = in.next();
        return Validator.isNumber(str) ? Double.parseDouble(str) : 0;
    }

    public double outPut() {
        final String str = in.next();
        return checkOut(str);
    }

    private double checkOut(final String str) {
        if (Validator.isNumber(str)) {
            if ((Runner.account.getBalance()) > (Double.parseDouble(str))) {
                return checkDecimal(str);
            }
            Display.noMoney();
        }
        return 0;
    }

    double checkDecimal(final String str) {
        final int decimal;
        if ((decimal = Validator.checkDecimal(str)) != 0) {
            return ifNotZero(str, decimal);
        }
        new CashBox().getMoney(Double.parseDouble(str) - decimal);
        return Double.parseDouble(str);
    }

    private double ifNotZero(final String str, final int decimal) {
        Display.notZero();
        if (toZero()) {
            new CashBox().getMoney(Double.parseDouble(str) - decimal);
            return (Double.parseDouble(str) - decimal);
        }
        return 0;
    }

    private boolean toZero() {
        final String str = in.next();
        if (Validator.isNumber(str) && Integer.parseInt(str) == 0) {
            return true;
        }
        return false;
    }

    public void exit() {
        in.close();
    }

}
