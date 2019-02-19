package by.itacademy.java.yaskelevich.home.practic3.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//2. В тексте найти и напечатать n символов (и их количество),
//встречающихся наиболее часто. n задать из консоли при старте программы.
public class Task2 {
    private final Array array = new Array();
    private final BufferedWriter writer;
    private final BufferedReader reader;
    private final int[][] charNumber = new int[128][2];
    private final int arrIndex = 0;
    private final String tmp = "src/by/itacademy/java/yaskelevich/home/practic3/task2/txt/tmp.txt";

    public Task2(final String filePathIn, final String filePathOut) throws IOException {
        this.reader = new BufferedReader(new FileReader(filePathIn));
        this.writer = new BufferedWriter(new FileWriter(tmp));
    }

    public void search() throws IOException {
        int character = 0;
        while ((character = reader.read()) >= 0) {
            if (array.isNewChar(character)) {
                array.setChar(character);
            }
        }
        array.howMany();
        array.showMaxChar();
    }

}
