package by.itacademy.java.yaskelevich.home.practic2.var2.task2;

//найти максимальный элемент (ы) в матрице и удалить из матрицы все строки
//и столбцы, его содержащие.
public class Task2 {
    private double[][] matrix;
    private double max;

    public void findMax(final double[][] array) {
        this.max = array[0][0];
        for (final double[] tmp : array) {
            compare(tmp);
        }
        this.matrix = array;
        while (!isMax(this.matrix)) {
            isMax(this.matrix);
        }

    }

    private void compare(final double[] tmp) {
        for (final double i : tmp) {
            if (this.max < i) {
                this.max = i;
            }
        }
    }

    private boolean isMax(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == this.max) {
                    newArray(matrix);
                    delete(matrix, i, j);
                    return false;
                }
            }
        }
        return true;
    }

    private void delete(final double[][] matrix, final int x, final int y) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = matrix[i + getX(i, x)][j + getY(j, y)];
            }
        }
    }

    private int getX(final int i, final int x) {
        return i == x || i > x ? 1 : 0;
    }

    private int getY(final int j, final int y) {
        return j == y || j > y ? 1 : 0;
    }

    private void newArray(final double[][] matrix) {
        this.matrix = new double[matrix.length - 1][matrix.length - 1];
    }

    public double getMax() {
        return this.max;
    }

    public double[][] getMatrix() {
        return this.matrix;
    }

}
