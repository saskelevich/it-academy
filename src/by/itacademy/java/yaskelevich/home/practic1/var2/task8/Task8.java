package by.itacademy.java.yaskelevich.home.practic1.var2.task8;

import by.itacademy.java.yaskelevich.home.practic1.var2.task3.Task3;

//вывести на консоль первое число-палиндром (одинаково читающееся в обоих направлениях.
//Например, число 404)
public class Task8 {

    private static final int INDEX = -1;
    private final Task3 ob = new Task3();

    public void show(final String[] args) {
        System.out.print("Palindrom numbers: ");
        for (int i = 0; i < args.length; i++) {
            if (isEquals(args[i])) {
                System.out.print(args[i] + "; ");
            }
        }
        System.out.println();
    }

    private int[] conv(final String args) {
        return ob.convert(Integer.parseInt(args), args.length());
    }

    private boolean isEquals(final String args) {
        final int[] array = conv(args);
        if (!isDigit(array)) {
            return false;
        }
        for (int i = 0; i < (args.length() / 2); i++) {
            if (getBegNum(array, i) != getLastNum(array, i)) {
                return false;
            }
        }
        return true;
    }

    private int getBegNum(final int[] array, final int i) {
        return array[i];
    }

    private int getLastNum(final int[] array, final int i) {
        return array[array.length + (INDEX - i)];
    }

    private boolean isDigit(final int[] array) {
        return array.length > 1 ? true : false;
    }
}
