package by.itacademy.java.yaskelevich.home.practic3.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Random;

//1. В каждом слове текста k-ю букву заменить заданным символом.
//Если k больше длины слова, корректировку не выполнять.
//Слово и k задать из консоли при старте программы.
public class Task1 {

    private final Writer writer;
    private final Reader reader;
    private final Random rand = new Random();

    public Task1(final String filePathIn, final String filePathOut) throws IOException {
        this.reader = new BufferedReader(new FileReader(filePathIn));
        this.writer = new BufferedWriter(new FileWriter(filePathOut));

    }

    public void changeNChar() throws IOException {
        int character;
        int index = 0;
        final int rand = this.rand.nextInt(7);
        while ((character = reader.read()) != -1) {
            index++;
            if (character == ' ' || character == '\n' || character == ',' || character == '.') {
                index = 0;
            }
            if (index == rand) {
                character = '_';
            }
            writer.write((char) character);
        }
        writer.close();
        System.out.printf("Character = \'_\'\nNumber = %d\n", rand);
    }

}
