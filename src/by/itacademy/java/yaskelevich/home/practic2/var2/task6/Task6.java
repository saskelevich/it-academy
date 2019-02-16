package by.itacademy.java.yaskelevich.home.practic2.var2.task6;

//найти сумму элементов матрицы, расположенных между первым и вторым
//положительными элементами каждой строки
public class Task6 {
    private double sum;

    public void findSumm(final double[][] matrix) {
        findFirstUnsigned(matrix);
    }

    private void findFirstUnsigned(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            isUnsigned(matrix, i);
            System.out.println("Lines(" + i + ") summa = " + sum);
        }
        System.out.println();
    }

    private void isUnsigned(final double[][] matrix, final int i) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] > 0) {
                getSum(matrix, i, j + 1);
                break;
            }
        }
    }

    private void getSum(final double[][] matrix, final int x, final int y) {
        for (int i = y; i < matrix.length; i++) {
            if (matrix[x][i] >= 0) {
                break;
            }
            sum += matrix[x][i];
            if (i == matrix.length - 1) {
                if (matrix[x][i] < 0) {
                    sum = 0;
                }
            }
        }
    }

}
