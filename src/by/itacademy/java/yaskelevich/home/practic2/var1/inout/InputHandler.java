package by.itacademy.java.yaskelevich.home.practic2.in;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic2.matrix.Matrix;

public class InputHandler {

    private static final String[] YES = {"y", "Y"};

    private final Scanner in = new Scanner(System.in);
    private final Matrix mat = new Matrix();

    public void setMaxNum(final int maxNum) {
        mat.setMax(maxNum);
    }

    public void setLength(final int length) {
        mat.setLength(length);
    }

    public boolean ask() {
        if (answer(in.next())) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] show() {
        return mat.writeMatrix();
    }

    public boolean answer(final String str) {
        for (int i = 0; i < YES.length; i++) {
            if (YES[i].equals(str)) {
                return true;
            }
        }
        return false;
    }
}
