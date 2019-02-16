package by.itacademy.java.yaskelevich.home.practic1.var2.task4;

//вывести на консоль числа, которые делятся на 3 или на 5
public class Task4 {

    public void showThreeFive(final String[] args) {
        System.out.print("\nDevided by three and five: ");
        printTreeFive(args);
        System.out.println();
    }

    void printTreeFive(final String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (((Integer.parseInt(args[i]) % 3) == 0) && ((Integer.parseInt(args[i]) % 5) == 0)
                    && (Integer.parseInt(args[i]) != 0)) {
                System.out.print(args[i] + "; ");
            }
        }
    }
}
