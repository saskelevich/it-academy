package by.itacademy.java.yaskelevich.home.practic2.var2.quest1;

//округлить все элементы матрицы до целого числа
public class Quest1 {

    public double[][] toInt(final double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = (int) array[i][y];
            }
        }
        return array;
    }

}
