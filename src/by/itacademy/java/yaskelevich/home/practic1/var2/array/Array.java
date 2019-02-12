package by.itacademy.java.yaskelevich.home.practic1.var2.array;

import java.util.Scanner;

public class Array {

    private int length;
    private final String[] array = new String[10];
    private final Scanner in = new Scanner(System.in);

    public void start() {
        System.out.println("Wrute array length: ");
        length = Integer.parseInt(in.next());
        System.out.println("Write array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.next();
        }
    }

    public String[] getArray() {
        return array;
    }
}
