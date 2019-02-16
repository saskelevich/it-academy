package by.itacademy.java.yaskelevich.home.practic2.var2.out;

public class Show {

    public void show(final double[][] matrix, final String title) {
        System.out.print("\n" + title + ":\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print("[" + matrix[i][y] + "] ");
            }
            System.out.println();
        }
    }
}
