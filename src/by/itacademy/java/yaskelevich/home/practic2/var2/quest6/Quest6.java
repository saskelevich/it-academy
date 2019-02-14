package by.itacademy.java.yaskelevich.home.practic2.var2.quest6;

//найти сумму элементов матрицы, расположенных между первым и вторым
//положительными элементами каждой строки
public class Quest6 {

    public void findSumm(final double[][] matrix) {
        findFirstUnsigned(matrix);
    }

    private void findFirstUnsigned(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > 0) {
                    sum = getSum(matrix, i, j + 1);
                    break;
                }
            }
            System.out.println("Lines(" + i + ") summa = " + sum);
        }
        System.out.println();
    }

    private double getSum(final double[][] matrix, final int x, final int y) {
        double sum = 0;
        for (int i = y; i < matrix.length; i++) {
            if (matrix[x][i] > 0) {
                break;
            }
            sum += matrix[x][i];
            if (i == matrix.length - 1) {
                if (matrix[x][i] < 0) {
                    sum = 0;
                }
            }
        }
        return sum;
    }

}
