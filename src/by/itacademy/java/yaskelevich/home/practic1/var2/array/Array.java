package by.itacademy.java.yaskelevich.home.practic1.var2.array;

import java.util.Scanner;

public class Array {

    private int length;
    private String[] array;
    private final Scanner in = new Scanner(System.in);

    public void start() {
        System.out.println("Wrute array length: ");
        setArray();
        System.out.println("Write array: ");
        setNumber();
    }

    private void setArray() {
        length = Integer.parseInt(in.next());
        array = new String[length];
    }

    private void setNumber() {
        for (int i = 0; i < length; i++) {
            array[i] = in.next();
        }
    }

    public String[] getArray() {
        return array;
    }
}
