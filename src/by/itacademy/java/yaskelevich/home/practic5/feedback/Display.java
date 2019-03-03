package by.itacademy.java.yaskelevich.home.practic5.feedback;

import java.text.NumberFormat;
import java.util.Locale;

import by.itacademy.java.yaskelevich.home.practic5.atm.data.Cell;

public class Display {
    public static final String ZERO = "key='0';";
    public static final String ONE = "key='1';";
    public static final String TWO = "key='2';";
    public static final String TREE = "key='3';";
    public static final String BALANCE = "Print balance:";
    public static final String INPUT = "Input menu:";
    public static final String OUTPUT = "Output menu:";
    public static final String EXIT = "Exit:";

    public static void start() {
        System.out.printf("Welcom in bankomat\nDescription: bancomat can output only %s, %s, %s;\n",
                inLocaleCash(50), inLocaleCash(20), inLocaleCash(10));
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

    public static void printBalance(final double balance) {
        windowBorder();
        System.out.printf("\n\tPrint balance\nYou'r balance = %s;\n", inLocaleCash(balance));
    }

    public static void input() {
        windowBorder();
        System.out.printf("\n\tInput mode\nWrite summ for input: ");
    }

    public static void output() {
        windowBorder();
        System.out.printf(
                "\n\tOutput mode\n(The number entered must be an integer and ends with a zero)"
                        + "\n\nWrite summ for output: ");
    }

    public static void exit() {
        windowBorder();
        System.out.printf("\nExit.");
    }

    public static void actionFinish() {
        inWindowBorder();
        System.out.printf("\n\tAction finish.");
    }

    public static void showCell(final Cell cell) {
        inWindowBorder();
        System.out.printf("\nCell %s:", inLocaleCash(cell.getNameCell()));
        System.out.printf("\n\t%d", cell.getValue());
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

    public static String inLocaleCash(final double number) {
        return NumberFormat.getCurrencyInstance(new Locale("by", "BY")).format(number);
    }

    public static void inputException() {
        System.out.printf("\nInputException\nTry Again");
    }

    public static void outputException() {
        System.out.printf("\nOutputException\nTry Again");
    }
}
