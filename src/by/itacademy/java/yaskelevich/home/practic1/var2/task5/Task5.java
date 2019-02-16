package by.itacademy.java.yaskelevich.home.practic1.var2.task5;

//вывести на консоль простые числа (делятся без остатка только на 1 и само на себя)
public class Task5 {

    public void showPrimeNumber(final String[] args) {
        System.out.print("\nPrime numbers: ");
        check(args);
        System.out.println();
    }

    void check(final String[] args) {
        for (int i = 0; i < args.length; i++) {
            boolean isPrime = true;
            for (int y = 2; y < Integer.parseInt(args[i]); y++) {
                isPrime = isTrue(args, i, isPrime, y);
            }
            print(args, i, isPrime);
        }
    }

    void print(final String[] args, final int i, final boolean isPrime) {
        if (isPrime && Integer.parseInt(args[i]) != 1 && Integer.parseInt(args[i]) != 0) {
            System.out.print(args[i] + "; ");
        }
    }

    private boolean isTrue(final String[] args, final int i, final boolean isPrime, final int y) {
        if ((Integer.parseInt(args[i]) % y) == 0) {
            return false;
        } else {
            return isPrime;
        }
    }

}
