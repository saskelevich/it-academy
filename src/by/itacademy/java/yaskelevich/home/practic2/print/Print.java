package by.itacademy.java.yaskelevich.home.practic2.print;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic2.in.InputHandler;

public class Print {

    private final Scanner in = new Scanner(System.in);
    private final InputHandler inHand = new InputHandler();

    public void start() {
        System.out.println(
                "You are must write two numbers.\nFirst numbers equals max numbers in matrix.\nSecond number equals length matrix");
        System.out.print("Write first number: ");
        setMaxNum();
        System.out.print("Write seconds number: ");
        setLength();
        System.out.print("Show you'r matrix('y' or 'Y' to show)?");
        if (inHand.ask()) {
            showMatrix(inHand.show());
        } else {
            System.out.println("Exit.");
            return;
        }
    }

    private void setMaxNum() {
        inHand.setMaxNum(Integer.parseInt(in.next()));
    }

    private void setLength() {
        inHand.setLength(Integer.parseInt(in.next()));
    }

    private void showMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
        }
    }
}
