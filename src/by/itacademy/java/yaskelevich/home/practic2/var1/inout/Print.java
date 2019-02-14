package by.itacademy.java.yaskelevich.home.practic2.var1.inout;

public class Print {

//    private final Scanner in = new Scanner(System.in);
    private final InputHandler inHand = new InputHandler();

    public void start() {
        System.out.println(
                "You are must write two numbers.\nFirst numbers equals max numbers in matrix."
                        + "\nSecond number equals length matrix");
        System.out.print("Write first number: ");
        setMaxNum();
        System.out.print("Write seconds number: ");
        setLength();
        System.out.print("You're have matrix:");
        showMatrix(inHand.show());
    }

    private void setMaxNum() {
        inHand.setMaxNum();
    }

    private void setLength() {
        inHand.setLength();
    }

    private void showMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
        }
        System.out.println();
    }
}
