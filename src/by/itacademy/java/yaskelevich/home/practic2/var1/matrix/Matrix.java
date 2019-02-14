package by.itacademy.java.yaskelevich.home.practic2.var1.matrix;

import java.util.Random;

public class Matrix {
    private int max, length;
    private final Random rand = new Random();

    public void setMax(final int max) {
        this.max = max;
    }

    public void setLength(final int length) {
        this.length = length;
    }

    public int[][] writeMatrix() {

        final int[][] array = new int[length][length];

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = rand.nextInt(max);
            }
        }
        return array;
    }
}
