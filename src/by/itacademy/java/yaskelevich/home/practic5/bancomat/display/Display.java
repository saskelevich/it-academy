package by.itacademy.java.yaskelevich.home.practic5.bancomat.display;

import by.itacademy.java.yaskelevich.home.practic5.bancomat.box.CashBox;

public abstract class Display {

    public static void start() {
        System.out
                .printf("Welcom in bankomat\nDescription: bancomat can output only 50, 20, 10;\n");
    }

    public static void pushCard() {
        inWindowBorder();
        System.out.printf("\nPush card?(y/n): ");
    }

    public static void mainWindow() {
        windowBorder();
        System.out.printf("\n\tMain window\nLook balance: key \'0\'\nMenu inputing cash: key \'1\'"
                + "\nMenu outputing cash: key \'2\'\nExit: key \'3\'");
        enter();
//        printBorder();
    }

    public static void enter() {
        inWindowBorder();
        System.out.printf("\n\nYou'r choice: ");
    }

    public static void lookBalance(final String balance) {
        windowBorder();
        System.out.printf("\n\tShow balace\nYou'r balance = %s;\n", balance);
//        if (balance < 0) {
//            System.out.printf("\nCollector is comming.\n");
//        }
//        enter();

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
        System.out.printf("\nBox %d = %d;", CashBox.FIFTY[0], CashBox.FIFTY[1]);
        System.out.printf("\nBox %d = %d;", CashBox.TWENTY[0], CashBox.TWENTY[1]);
        System.out.printf("\nBox %d = %d;", CashBox.TEN[0], CashBox.TEN[1]);
    }

    public static void windowBorder() {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.printf("#");
        }
    }

    public static void inWindowBorder() {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.printf("-");
        }
    }

}
