package by.itacademy.java.yaskelevich.home.practic3;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic3.task1.Task1;

public class Running {
    public static void main(final String[] args) throws IOException {
        new Task1("src/by/itacademy/java/yaskelevich/home/practic3/task1/txt/reader.txt",
                "src/by/itacademy/java/yaskelevich/home/practic3/task1/txt/writer.txt")
                        .changeNChar();
//        new Task2("src/by/itacademy/java/yaskelevich/home/practic3/task2/txt/reader.txt",
//                "src/by/itacademy/java/yaskelevich/home/practic3/task2/txt/writer.txt").search();
//        new Task3("src/by/itacademy/java/yaskelevich/home/practic3/task3/txt/reader.txt",
//                "src/by/itacademy/java/yaskelevich/home/practic3/task3/txt/writer.txt").isWord();
//        new Task4("src/by/itacademy/java/yaskelevich/home/practic3/task4/txt/reader.txt",
//                "src/by/itacademy/java/yaskelevich/home/practic3/task4/txt/writer.txt").isWord();
        System.out.println("Finish.");
    }
}
