package by.itacademy.java.yaskelevich.home.practic2.var2.matrix;

//Ввести с консоли n-размерность матрицы a [n] [n].
//Задать значения элементов матрицы в интервале значений от
//-n до n с помощью генератора случайных чисел (Random),
//включая числа с дробной частью.
import java.util.Scanner;

public class Matrix {

    private int value;
    private double[][] matrix;
    private final Scanner in = new Scanner(System.in);

    public void start() {
        printLength();
        value = in.nextInt();
        writMatr();
    }

    private void printLength() {
        System.out.println("Write matrix length: ");
    }

    private void writMatr() {
        matrix = new double[value][value];
        for (int i = 0; i < value; i++) {
            for (int y = 0; y < value; y++) {
                matrix[i][y] = ((Math.random() * (2 * value)) - value);
            }
        }
    }

    public void showMatr() {
        for (int i = 0; i < value; i++) {
            for (int y = 0; y < value; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
    }

    public double[][] getMatrix() {
        return this.matrix;
    }

    public double[][] getCopy() {
        final double[][] copy = new double[value][value];
        for (int i = 0; i < copy.length; i++) {
            for (int y = 0; y < copy[i].length; y++) {
                copy[i][y] = matrix[i][y];
            }
        }
        return copy;
    }

    public void setMatrix(final double[][] matrix) {
        this.matrix = matrix;
    }
}
