package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

import java.util.function.Consumer;

public class Reference {
    public static void main(final String[] args) {
        final Consumer<String> printFunction = System.out::print;
        printFunction.accept("Hello World");
    }
}
