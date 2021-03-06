package by.itacademy.java.yaskelevich.home.practic2.var2.task7;

//транспонировать квадратную матрицу
public class Task7 {
    private final double[][] matrix;

    public Task7(final double[][] matrix) {
        this.matrix = new double[matrix.length][matrix.length];
    }

    public void transpon(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                this.matrix[j][i] = matrix[i][j];
            }
        }
    }

    public double[][] getMatrix() {
        return this.matrix;
    }
}
