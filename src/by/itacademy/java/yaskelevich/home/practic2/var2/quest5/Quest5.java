package by.itacademy.java.yaskelevich.home.practic2.var2.quest5;

//построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое
public class Quest5 {
    private final double[][] matrix;

    public Quest5(final double[][] matrix) {
        this.matrix = new double[matrix.length][matrix.length];
    }

    public void meanArithmetical(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                setAritmInMatrix(((aritmLines(matrix, i) + aritmColumn(matrix, j)) / 2), i, j);
            }
        }
    }

    private double aritmLines(final double[][] matrix, final int mark) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[mark][i];
        }
        return sum / (matrix.length - 1);
    }

    private double aritmColumn(final double[][] matrix, final int mark) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][mark];
        }
        return sum / (matrix.length - 1);
    }

    private void setAritmInMatrix(final double arithmetical, final int x, final int y) {
        this.matrix[x][y] = arithmetical;
    }

    public double[][] getMatrix() {
        return this.matrix;
    }
}
