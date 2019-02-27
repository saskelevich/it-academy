package by.itacademy.java.yaskelevich.home.practic5.bancomat.display;

public abstract class Display {

    public static void start() {
        System.out
                .printf("Welcom in bankomat\nDescription: bancomat can output only 50, 20, 10;\n");
    }

    public static void pushCard() {
        System.out.printf("\nPush card?(y/n): ");
    }

    public static void mainWindow() {
        System.out.printf("\n\nLook balance: key \'0\'\nMenu inputing cash: key \'1\'"
                + "\nMenu outputing cash: key \'2\'\nExit: key \'3\'");
        enter();
    }

    public static void enter() {
        System.out.printf("\n\nYou'r choice: ");
    }

    public static void lookBalance(final String balance) {
        System.out.printf("\nYou'r balance = %s;\n", balance);
//        if (balance < 0) {
//            System.out.printf("\nCollector is comming.\n");
//        }
        enter();

    }

    public static void input() {
        System.out.printf("\nWrite summ for input: ");
    }

    public static void output() {
        System.out.printf("\nWrite summ for output: ");
    }

    public static void exit() {
        System.out.printf("\nExit.");
//        System.exit(0);
    }

    public static void tryAgain() {
        System.out.printf("\nTry again: ");
    }

    public static void actionFinish() {
        System.out.printf("Action finish.");
    }

    public static void notZero() {
        System.out.printf("\n\nYou'r number must have zero in decimal.\n"
                + "\nSbrosit in zero: \'0\'" + "\nReturn main menu: \'anykey\'");
    }

}
