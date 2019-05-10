package by.itacademy.java.yaskelevich.home.practic3.task2;

import java.io.IOException;
import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practic3.url.ReadURL;

//2. В тексте найти и напечатать n символов (и их количество),
//встречающихся наиболее часто. n задать из консоли при старте программы.
public class Task2 {
    private final ArrayChar array = new ArrayChar();
    private final String text;
    private int character;

    public Task2(final String url) throws IOException {
        this.text = ReadURL.readFromUrl(url);
    }

    private void putChar() {
        final Scanner in = new Scanner(System.in);
        System.out.printf("Write character: ");
        this.character = in.next().charAt(0);
        in.close();
    }

    public void search() throws IOException {
        putChar();
        for (int i = 0; i < text.length(); i++) {
            if (array.checkIsNew(text.charAt(i))) {
                array.setChar(text.charAt(i));
            }
        }
        array.showHowMany();
        array.showMaxChar();
        array.showChar(this.character);
    }

}
