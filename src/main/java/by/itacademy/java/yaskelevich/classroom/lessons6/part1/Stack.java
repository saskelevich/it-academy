package by.itacademy.java.yaskelevich.classroom.lessons6.part1;

import java.io.IOException;

public class Stack {
    public static void main(final String[] args) throws IOException {
        System.out.println("main method in stack");
        test1();
        System.out.println("-test1 method from stack");
    }

    private static void test1() {
        System.out.println("+test1 method in stack");
        test2();
        System.out.println("-test2 method from stack");
    }

    private static void test2() {
        System.out.println("+test2 method in stack");
        test3();
        System.out.println("-test3 method from stack");
    }

    private static void test3() {
        System.out.println("+test3 method in stack");
        System.out.println("inside test3 method");
    }
}