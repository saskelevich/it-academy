package by.itacademy.java.yaskelevich.home.practic1.var2;

import by.itacademy.java.yaskelevich.home.practic1.var2.array.Array;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest1.Quest1;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest2.Quest2;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest3.Quest3;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest4.Quest4;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest5.Quest5;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest6.Quest6;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest7.Quest7;
import by.itacademy.java.yaskelevich.home.practic1.var2.quest8.Quest8;

public class Running {
    public static void main(final String[] args) {

        final Array ar = new Array();

        final Quest1 ob1 = new Quest1();
        final Quest2 ob2 = new Quest2(ar.getArray());
        final Quest3 ob3 = new Quest3();
        final Quest4 ob4 = new Quest4();
        final Quest5 ob5 = new Quest5();
        final Quest6 ob6 = new Quest6();
        final Quest7 ob7 = new Quest7();
        final Quest8 ob8 = new Quest8();

        ob1.show(ar.getArray());
        ob2.showLarger(ar.getArray());
        ob2.showLess(ar.getArray());
        ob3.showEven(ar.getArray());
        ob4.showThreeFive(ar.getArray());
        ob5.showPrimeNumber(ar.getArray());
        ob6.show(ar.getArray());
        ob7.show(ar.getArray());
        ob8.show(ar.getArray());

    }
}
