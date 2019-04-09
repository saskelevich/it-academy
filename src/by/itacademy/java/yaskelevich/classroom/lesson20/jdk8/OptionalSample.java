package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

import java.util.Optional;

public class OptionalSample {
    public static void main(final String[] args) {
        final Optional<String> fulName = Optional.ofNullable(null);
        System.out.println("Full name is set?" + fulName.isPresent());
        System.out.println("Full Name:" + fulName.orElseGet(() -> "[none]"));
        System.out.println(fulName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
