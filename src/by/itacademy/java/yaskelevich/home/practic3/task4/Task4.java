package by.itacademy.java.yaskelevich.home.practic3.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    private BufferedWriter writer;
    private BufferedReader reader;
    private final String tmp = "src/by/itacademy/java/yaskelevich/home/practic3/task4/txt/tmp.txt";
    private int character;
    private final String filePathOut;
    private final String filePathIn;
    private String str;
    private int max = 1;
    private int min = 1;

    public Task4(final String filePathIn, final String filePathOut) throws IOException {
        this.reader = new BufferedReader(new FileReader(filePathIn));
        this.writer = new BufferedWriter(new FileWriter(tmp));
        this.filePathIn = filePathIn;
        this.filePathOut = filePathOut;
    }

    public void isWord() throws IOException {
        while ((character = reader.read()) != -1) {
            if (Character.isLetter(character)) {
                writer.write((char) character);
            } else {
                writer.newLine();
            }
        }
        writer.close();
        searchMaxMin();
        writeMax();
    }

    private void searchMaxMin() throws IOException {
        this.reader = new BufferedReader(new FileReader(tmp));
        while (reader.ready()) {
            str = reader.readLine();
            if (str.length() - 1 > this.max) {
                this.max = str.length();
            }
            if (str.length() < this.min) {
                this.min = str.length();
            }
        }
        reader.close();
    }

    private void writeMax() throws IOException {
        this.writer = new BufferedWriter(new FileWriter(filePathOut));
        this.reader = new BufferedReader(new FileReader(tmp));
        writer.write("Max:\n");
        while (reader.ready()) {
            str = reader.readLine();
            if (str.length() == this.max) {
                writer.write(str);
                writer.newLine();
            }
        }
        reader.close();
        writer.flush();
        writeMin();
    }

    private void writeMin() throws IOException {
        this.reader = new BufferedReader(new FileReader(tmp));
        writer.write("#\n#\nMin:\n#\n#\n");
        while (reader.ready()) {
            str = reader.readLine();
            if (str.length() == this.min) {
                writer.write(str);
                writer.newLine();
            }
        }
        reader.close();
        writer.close();
    }
}
