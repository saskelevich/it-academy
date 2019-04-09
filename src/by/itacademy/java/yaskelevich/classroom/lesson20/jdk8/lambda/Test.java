package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test {
    public static void main(final String[] args) {
        Arrays.asList("a", "b", "d").forEach(new Consumer<String>() {
            @Override
            public void accept(final String e) {
                System.out.println(e);
            }
        });
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
    }

}
