package by.itacademy.java.yaskelevich.home.practic3.task1;

import java.io.IOException;
import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic3.url.ReadURL;

//1. В каждом слове текста k-ю букву заменить заданным символом.
//Если k больше длины слова, корректировку не выполнять.
//Слово и k задать из консоли при старте программы.
public class Task1 {
    private int character = '?';
    private int index = 1;
    private final String text;
    private final Scanner in = new Scanner(System.in);

    public Task1(final String url) throws IOException {
        this.text = ReadURL.readFromUrl(url);
        this.index = putIndex();
        this.character = putChar();
    }

    private int putIndex() {
        System.out.print("\nWrite index:");
        return in.nextInt();
    }

    private int putChar() {
        System.out.print("\nWrite character:");
        return in.next().charAt(0);
    }

    public void searchChar() throws IOException {

        final String[] array = text.split("\\W+");
        final StringBuilder[] strBuilder = new StringBuilder[array.length];
        for (int j = 0; j < array.length; j++) {
            strBuilder[j] = new StringBuilder(array[j]);
            changeChar(strBuilder, j);
        }
        show(strBuilder);
    }

    private void show(final StringBuilder[] strBuilder) throws IOException {
        System.out.println();
        for (final StringBuilder s : strBuilder) {
            System.out.printf("%s ", s);
        }
        System.out.printf("\n\n");
    }

    private void changeChar(final StringBuilder[] strBuider, final int i) {
        if (strBuider[i].length() >= index) {
            strBuider[i] = strBuider[i].deleteCharAt(index - 1);
            strBuider[i] = strBuider[i].insert(index - 1, (char) character);
        }
    }
}
