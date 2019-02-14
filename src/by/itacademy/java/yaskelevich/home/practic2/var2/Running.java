package by.itacademy.java.yaskelevich.home.practic2.var2;

import by.itacademy.java.yaskelevich.home.practic2.var2.matrix.Matrix;
import by.itacademy.java.yaskelevich.home.practic2.var2.print.Show;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest1.Quest1;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest2.Quest2;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest3.Quest3;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest4.Quest4;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest5.Quest5;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest6.Quest6;
import by.itacademy.java.yaskelevich.home.practic2.var2.quest7.Quest7;

public class Running {
    public static void main(final String[] args) {

        final Matrix matrix = new Matrix();
        final Show show = new Show();

        matrix.start();

        final Quest1 ob1 = new Quest1();
        show.show(matrix.getCopy(), "Quest 1\nBefore");
        show.show(ob1.toInt(matrix.getCopy()), "After");
        System.out.println();

        final Quest2 ob2 = new Quest2();
        ob2.findMax(matrix.getCopy());
        show.show(matrix.getCopy(), "Quest 2\nBefore");
        show.show(ob2.getMatrix(), "After");
        System.out.print("(Quest 2 max number = " + ob2.getMax() + ")");
        System.out.println();

        final Quest3 ob3 = new Quest3(matrix.getCopy());
        ob3.findZeroLines(matrix.getCopy());
        show.show(matrix.getCopy(), "Quest 3\nBefore");
        show.show(ob3.getMatrix(), "After");
        System.out.println();

        final Quest4 ob4 = new Quest4(matrix.getCopy());
        ob4.sort(matrix.getCopy());
        show.show(matrix.getCopy(), "Quest 4\nBefore");
        show.show(ob4.getMatrix(), "After");
        System.out.println("rand = " + ob4.getRand());
        ob4.showTemplate();
        System.out.println();

        final Quest5 ob5 = new Quest5(matrix.getCopy());
        ob5.meanArithmetical(matrix.getCopy());
        show.show(matrix.getCopy(), "Quest 5\nBefore");
        show.show(ob5.getMatrix(), "After");
        System.out.println();

        final Quest6 ob6 = new Quest6();
        show.show(matrix.getCopy(), "Quest 6\nBefore");
        System.out.println("\nAfter:");
        ob6.findSumm(matrix.getCopy());

        final Quest7 ob7 = new Quest7(matrix.getCopy());
        ob7.transpon(matrix.getCopy());
        show.show(matrix.getCopy(), "Quest 7\nBefore");
        show.show(ob7.getMatrix(), "After");

    }
}
