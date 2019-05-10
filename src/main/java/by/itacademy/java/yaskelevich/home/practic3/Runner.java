package by.itacademy.java.yaskelevich.home.practic3;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic3.task1.Task1;
import by.itacademy.java.yaskelevich.home.practic3.task2.Task2;
import by.itacademy.java.yaskelevich.home.practic3.task3.Task3;
import by.itacademy.java.yaskelevich.home.practic3.task4.Task4;

public class Runner {
    private static final String URL = "https://sample-videos.com/text/Sample-text-file-10kb.txt";

    public static void main(final String[] args) throws IOException {
        System.out.println("Task 1");
        new Task1(URL).searchChar();
        System.out.println("Task 2\n");
        new Task2(URL).search();
        System.out.println("Task 3\n");
        new Task3(URL).isWord();
        System.out.println("Task 4\n");
        new Task4(URL).isMaxMin();
    }

}
