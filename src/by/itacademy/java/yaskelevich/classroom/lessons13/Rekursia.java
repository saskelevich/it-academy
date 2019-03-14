package by.itacademy.java.yaskelevich.classroom.lessons13;

import java.util.ArrayList;

public class Rekursia {
    public static void main(final String[] args) {
        final ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(11);
        array.add(265);
        array.add(177);
        array.add(745);
        array.add(5447);
        for (final Integer number : array) {
            System.out.println(rekursia(number, number - 1));
        }
    }

    private static String rekursia(final int x, final int y) {
        if (x >= 36000) {
            return "Too large number";
        }
        if ((x % y == 0) && (y != 1)) {
            return "No";
        }
        return (y > 1) ? rekursia(x, y - 1) : "Yes";
    }
}
