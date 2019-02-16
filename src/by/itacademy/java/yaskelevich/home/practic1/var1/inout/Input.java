package by.itacademy.java.yaskelevich.home.practic1.var1.inout;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic1.var1.validation.Validator;

public class Input {

    private final Scanner in = new Scanner(System.in);
    private final Validator valid = new Validator();

    int put() {
        final String num = in.next();
        return check(num);
    }

    private int check(final String num) {
        return valid.convertToInt(num);
    }
}
