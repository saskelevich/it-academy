package by.itacademy.java.yaskelevich.home.practic4atm;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic4atm.atm.ATM;
import by.itacademy.java.yaskelevich.home.practic4atm.atm.data.Cell;
import by.itacademy.java.yaskelevich.home.practic4atm.feedback.Display;

public class Runner {
    private static final int EXIT = 3;
    private static final int OUTPUT = 2;
    private static final int INPUT = 1;
    private static final int BALANCE = 0;

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final ATM atm = new ATM();
        mainMenu(atm, in);
        in.close();
    }

    private static void mainMenu(final ATM atm, final Scanner in) {
        String index = "4";
        do {

            switch (returnNumber(index)) {

            case BALANCE:
                Display.printBalance(atm.getAccount().getBalance());
                break;
            case INPUT:
                Display.input();
                if (atm.add(in.next())) {
                    Display.actionFinish();
                } else {
                    Display.inputException();
                }
                break;
            case OUTPUT:
                Display.output();
                if (atm.substract(in.next())) {
                    Display.actionFinish();
                    for (final Cell cell : atm.getCell()) {
                        Display.showCell(cell);
                    }
                } else {
                    Display.outputException();
                }
                break;
            default:
                Display.notFound();
                break;
            }
            Display.mainWindow();
            index = in.next();
        }
        while (returnNumber(index) != EXIT);
        Display.exit();
    }

    private static int returnNumber(final String str) {
        try {
            return Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            return -1;
        }
    }

}
