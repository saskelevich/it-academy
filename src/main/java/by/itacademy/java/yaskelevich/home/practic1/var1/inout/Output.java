package by.itacademy.java.yaskelevich.home.practic1.var1.inout;

public class Output {

    private static final String[] MONTH = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private static final int ONE = -1;

    private final Input ob = new Input();

    public void start() {
        System.out.print("Write month number(1-12): ");
        final int num = ob.put();
        answer(num);
    }

    private void answer(final int num) {
        if (num > 0) {
            System.out.println("Your month: " + MONTH[num + ONE]);
        } else {
            System.out.println("\nNot a number, or number is not valid.\nTry again.\n");
            start();
        }
    }
}