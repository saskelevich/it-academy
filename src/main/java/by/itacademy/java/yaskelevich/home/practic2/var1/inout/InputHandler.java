package by.itacademy.java.yaskelevich.home.practic2.var1.inout;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic2.var1.matrix.Matrix;

public class InputHandler {

    private final Scanner in = new Scanner(System.in);
    private final Matrix mat = new Matrix();

    public void setMaxNum() {
        mat.setMax(Integer.parseInt(in.next()));
    }

    public void setLength() {
        mat.setLength(Integer.parseInt(in.next()));
    }

    public int[][] show() {
        return mat.writeMatrix();
    }
}
