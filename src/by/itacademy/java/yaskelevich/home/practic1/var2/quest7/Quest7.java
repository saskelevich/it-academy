package by.itacademy.java.yaskelevich.home.practic1.var2.quest7;

//вывести на консоль простые числа (делятся без остатка только на 1 и само на себя)
public class Quest7 {

    private static final int TWO = 2;

    public void show(final String[] args) {
        System.out.print("Prime numbers: ");
        for (int i = 0; i < args.length; i++) {
            if (isPrime(args[i])) {
                System.out.print(args[i] + "; ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(final String args) {
        if (Integer.parseInt(args) == TWO) {
            return true;
        }
        return check(1, Integer.parseInt(args));
    }

    private boolean check(final int i, final int num) {
        int tmp = i;
        if (tmp < num - 1) {
            if (!check(++tmp, num)) {
                return false;
            }
        }
        return (num % i != 0);
    }
}
