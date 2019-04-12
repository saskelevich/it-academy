package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base_64 {
    public static void main(final String[] args) {
        final String text = "Based finally in java 8";

        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);
        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);
        // System.out.println("\u20BF");
    }

}
