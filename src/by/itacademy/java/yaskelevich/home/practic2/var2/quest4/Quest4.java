package by.itacademy.java.yaskelevich.home.practic2.var2.quest4;

import java.util.Random;

//упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов
//k-го столбца (строки). значение "k" генерируется рандомно при каждом запуске
//программы (в границах размерности массива)
public class Quest4 {
    private final Random rand = new Random();
    private final int index;
    private final double[][] matrix;
    private final int[] templat;

    public Quest4(final double[][] matrix) {
        this.matrix = new double[matrix.length][matrix[0].length];
        index = rand.nextInt(matrix.length);
        templat = new int[matrix[0].length];
    }

    public int getRand() {
        return this.index;
    }

    public void showTemplate() {
        for (int i = 0; i < templat.length; i++) {
            System.out.print(templat[i] + " ");
        }
    }

    public void sort(final double[][] matrix) {

        setTemplate(setSample(matrix));
        setMatrix(matrix);
    }

    private double[] setSample(final double[][] matrix) {
        final double[] sample = new double[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            sample[i] = matrix[index][i];
        }
        return sample;
    }

    private void setTemplate(final double[] sample) {
        for (int i = 0; i < sample.length; i++) {
            templat[i] = compare(sample, sample[i], i);
        }
    }

    private int compare(final double[] sample, final double value, final int x) {
        int index = 0;
        for (int i = 0; i < sample.length; i++) {
            if (value > sample[i]) {
                index++;
            }
        }
        return index;
    }

    private void setMatrix(final double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j] = matrix[templat[i]][j];
            }
        }
    }

    public double[][] getMatrix() {
        return this.matrix;
    }
}
