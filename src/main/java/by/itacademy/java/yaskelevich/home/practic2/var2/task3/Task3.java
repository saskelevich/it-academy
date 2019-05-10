package by.itacademy.java.yaskelevich.home.practic2.var2.task3;

//уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
public class Task3 {
    private double[][] matrix;

    public Task3(final double[][] matrix) {
        this.matrix = matrix;
    }

    public void findZeroLines(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (!checkLines(i, matrix)) {
                deletLines(i, matrix);
            }
            if (!checkColumn(i, matrix)) {
                deletColumn(i, matrix);
            }
        }
    }

    private boolean checkLines(final int x, final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if ((int) matrix[x][i] != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumn(final int y, final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if ((int) matrix[i][y] != 0) {
                return true;
            }
        }
        return false;
    }

    private void deletLines(final int x, final double[][] matrix) {
        extractLines();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = matrix[i + getIndex(i, x)][j];
            }
        }
    }

    private void deletColumn(final int x, final double[][] matrix) {
        extractColumn();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = matrix[i][j + getIndex(i, x)];
            }
        }
    }

    private void extractLines() {
        this.matrix = new double[this.matrix.length - 1][this.matrix.length];
    }

    private void extractColumn() {
        this.matrix = new double[this.matrix.length][this.matrix.length - 1];
    }

    private int getIndex(final int i, final int x) {
        return i == x || i > x ? 1 : 0;
    }

    public double[][] getMatrix() {
        return this.matrix;
    }
}