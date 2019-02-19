package by.itacademy.java.yaskelevich.home.book.chapter1.A;

import java.util.Scanner;

public class QuestA4 {
    public static void main(final String[] args) {

        final String PASSWORD = "Pa$$wOrD";

        final Scanner in = new Scanner(System.in);

        final String password = in.next();

        System.out.println(password.equals(PASSWORD));
    }
}
