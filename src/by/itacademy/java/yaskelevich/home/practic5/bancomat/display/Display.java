package by.itacademy.java.yaskelevich.home.practic5.bancomat.display;

import java.text.NumberFormat;
import java.util.Locale;

import by.itacademy.java.yaskelevich.home.practic5.bancomat.box.CashBox;

public abstract class Display {
    public static final String ZERO = "key='0';";
    public static final String ONE = "key='1';";
    public static final String TWO = "key='2';";
    public static final String TREE = "key='3';";
    public static final String BALANCE = "Look balance:";
    public static final String INPUT = "Menu inputing cash:";
    public static final String OUTPUT = "Menu outputing cash:";
    public static final String EXIT = "Exit:";

    public static void start() {
        System.out.printf("Welcom in bankomat\nDescription: bancomat can output only %s, %s, %s;\n",
                inLocaleCash(CashBox.FIFTY[0]), inLocaleCash(CashBox.TWENTY[0]),
                inLocaleCash(CashBox.TEN[0]));
    }

    public static void pushCard() {
        inWindowBorder();
        System.out.printf("\nPush card?(y/n): ");
    }

    public static void mainWindow() {
        windowBorder();
        System.out.printf("\n\tMain window\n%-25s%-30s\n%-25s%-30s\n%-25s%-30s\n%-25s%-30s",
                BALANCE, ZERO, INPUT, ONE, OUTPUT, TWO, EXIT, TREE);
        enter();
    }

    public static void enter() {
        inWindowBorder();
        System.out.printf("\n\nYou'r choice: ");
    }

    public static void lookBalance(final String balance) {
        windowBorder();
        System.out.printf("\n\tShow balace\nYou'r balance = %s;\n",
                inLocaleCash(Double.parseDouble(balance)));
        if (Double.parseDouble(balance) < 0) {
            System.out.printf("\nCollector is comming.\n");
        }
        enter();

    }

    public static void input() {
        windowBorder();
        System.out.printf("\n\tInput mode\nWrite summ for input: ");
    }

    public static void output() {
        windowBorder();
        System.out.printf("\n\tOutput mode\nWrite summ for output: ");
    }

    public static void exit() {
        windowBorder();
        System.out.printf("\nExit.");
    }

    public static void tryAgain() {
        inWindowBorder();
        System.out.printf("\nTry again: ");
    }

    public static void actionFinish() {
        inWindowBorder();
        System.out.printf("\n\tAction finish.");
    }

    public static void notZero() {
        inWindowBorder();
        System.out.printf("\n\nYou'r number must have zero in decimal.\n"
                + "\nSbrosit in zero: \'0\'" + "\nReturn main menu: \'anykey\'");
        enter();
    }

    public static void noMoney() {
        inWindowBorder();
        System.out.println("You'r write to mutch numbers");
    }

    public static void getMoney() {
        inWindowBorder();
//        System.out.printf("\nBox %s = %d;", inLocaleCash(CashBox.FIFTY[0]), CashBox.FIFTY[1]);
//        System.out.printf("\nBox %s = %d;", inLocaleCash(CashBox.TWENTY[0]), CashBox.TWENTY[1]);
//        System.out.printf("\nBox %s = %d;", inLocaleCash(CashBox.TEN[0]), CashBox.TEN[1]);
        System.out.printf("\nBox %s:", inLocaleCash(CashBox.FIFTY[0]));
        System.out.printf("\t\tBox %s:", inLocaleCash(CashBox.TWENTY[0]));
        System.out.printf("\t\tBox %s:", inLocaleCash(CashBox.TEN[0]));
        System.out.printf("\n\t%d", CashBox.FIFTY[1]);
        System.out.printf("\t\t\t%d", CashBox.TWENTY[1]);
        System.out.printf("\t\t\t%d", CashBox.TEN[1]);
    }

    public static void windowBorder() {
        System.out.println();
        for (int i = 0; i < 70; i++) {
            System.out.printf("#");
        }
    }

    public static void inWindowBorder() {
        System.out.println();
        for (int i = 0; i < 70; i++) {
            System.out.printf("-");
        }
    }

    public static String inLocaleCash(final double summ) {
//        return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(summ);
        return NumberFormat.getCurrencyInstance(new Locale("by", "BY")).format(summ);
    }

}
