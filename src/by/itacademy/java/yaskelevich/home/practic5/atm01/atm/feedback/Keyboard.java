package by.itacademy.java.yaskelevich.home.practic5.atm01.atm.feedback;

import java.util.Scanner;

public class Keyboard {
    private final Scanner in;

    public Keyboard() {
        in = new Scanner(System.in);
    }

    public String input() {
        return in.next();
    }

    public void exit() {
        in.close();
    }
}
