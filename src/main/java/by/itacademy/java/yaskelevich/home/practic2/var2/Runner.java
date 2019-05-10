package by.itacademy.java.yaskelevich.home.practic2.var2;

import by.itacademy.java.yaskelevich.home.practic2.var2.matrix.Matrix;
import by.itacademy.java.yaskelevich.home.practic2.var2.out.Show;
import by.itacademy.java.yaskelevich.home.practic2.var2.task1.Task1;
import by.itacademy.java.yaskelevich.home.practic2.var2.task2.Task2;
import by.itacademy.java.yaskelevich.home.practic2.var2.task3.Task3;
import by.itacademy.java.yaskelevich.home.practic2.var2.task4.Task4;
import by.itacademy.java.yaskelevich.home.practic2.var2.task5.Task5;
import by.itacademy.java.yaskelevich.home.practic2.var2.task6.Task6;
import by.itacademy.java.yaskelevich.home.practic2.var2.task7.Task7;

public class Runner {
    public static void main(final String[] args) {

        final Matrix matrix = new Matrix();
        final Show show = new Show();

        matrix.start();

        final Task1 ob1 = new Task1();
        show.show(matrix.getCopy(), "Task 1\nBefore");
        show.show(ob1.toInt(matrix.getCopy()), "After");
        System.out.println();

        final Task2 ob2 = new Task2();
        ob2.findMax(matrix.getCopy());
        show.show(matrix.getCopy(), "Task 2\nBefore");
        show.show(ob2.getMatrix(), "After");
        System.out.print("(Task 2 max number = " + ob2.getMax() + ")");
        System.out.println();

        final Task3 ob3 = new Task3(matrix.getCopy());
        ob3.findZeroLines(matrix.getCopy());
        show.show(matrix.getCopy(), "Task 3\nBefore");
        show.show(ob3.getMatrix(), "After");
        System.out.println();

        final Task4 ob4 = new Task4(matrix.getCopy());
        ob4.sort(matrix.getCopy());
        show.show(matrix.getCopy(), "Task 4\nBefore");
        show.show(ob4.getMatrix(), "After");
        System.out.println("rand = " + ob4.getRand());
        ob4.showTemplate();
        System.out.println();

        final Task5 ob5 = new Task5(matrix.getCopy());
        ob5.meanArithmetical(matrix.getCopy());
        show.show(matrix.getCopy(), "Task 5\nBefore");
        show.show(ob5.getMatrix(), "After");
        System.out.println();

        final Task6 ob6 = new Task6();
        show.show(matrix.getCopy(), "Task 6\nBefore");
        System.out.println("\nAfter:");
        ob6.findSumm(matrix.getCopy());

        final Task7 ob7 = new Task7(matrix.getCopy());
        ob7.transpon(matrix.getCopy());
        show.show(matrix.getCopy(), "Task 7\nBefore");
        show.show(ob7.getMatrix(), "After");

    }
}
