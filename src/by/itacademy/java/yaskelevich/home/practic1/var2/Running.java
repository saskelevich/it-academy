package by.itacademy.java.yaskelevich.home.practic1.var2;

import by.itacademy.java.yaskelevich.home.practic1.var2.array.Array;
import by.itacademy.java.yaskelevich.home.practic1.var2.task1.Task1;
import by.itacademy.java.yaskelevich.home.practic1.var2.task2.Task2;
import by.itacademy.java.yaskelevich.home.practic1.var2.task3.Task3;
import by.itacademy.java.yaskelevich.home.practic1.var2.task4.Task4;
import by.itacademy.java.yaskelevich.home.practic1.var2.task5.Task5;
import by.itacademy.java.yaskelevich.home.practic1.var2.task6.Task6;
import by.itacademy.java.yaskelevich.home.practic1.var2.task8.Task8;

public class Running {
    public static void main(final String[] args) {

        final Array ar = new Array();
        ar.start();
        final Task1 ob1 = new Task1();
        final Task2 ob2 = new Task2(ar.getArray());
        final Task3 ob3 = new Task3();
        final Task4 ob4 = new Task4();
        final Task5 ob5 = new Task5();
        final Task6 ob6 = new Task6();
        final Task8 ob8 = new Task8();

        ob1.show(ar.getArray());
        ob2.showLarger(ar.getArray());
        ob2.showLess(ar.getArray());
        ob2.showAverage();
        ob3.showEven(ar.getArray());
        ob4.showThreeFive(ar.getArray());
        ob5.showPrimeNumber(ar.getArray());
        ob6.show(ar.getArray());
        ob8.show(ar.getArray());

    }
}
