package by.itacademy.java.yaskelevich.home.practic1.var1.in;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic1.var1.validation.Validator;

public class InputHandler {

    private final Scanner in = new Scanner(System.in);
    private final Validator valid = new Validator();

    public int put() {
        final String num = in.next();
        return check(num);
    }

    private int check(final String num) {
        return valid.converter(num);
    }
}
