package by.itacademy.java.yaskelevich.home.practic3.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//3. Напечатать без повторения слова текста,
//у которых первая и последняя буквы совпадают.
public class Task3 {
    private BufferedWriter writer;
    private BufferedReader reader;
    private final String tmp = "src/by/itacademy/java/yaskelevich/home/practic3/task3/txt/tmp.txt";
    private int character;
    private final String filePathOut;
    private final String filePathIn;
    private String str;

    public Task3(final String filePathIn, final String filePathOut) throws IOException {
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
        writeEquals();
    }

    private void writeEquals() throws IOException {
        this.reader = new BufferedReader(new FileReader(tmp));
        this.writer = new BufferedWriter(new FileWriter(filePathOut));
        while (reader.ready()) {
            str = reader.readLine();
            if (str.length() > 1) {
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    writer.flush();
                    if (isHave(str)) {
                        writer.write(str);
                        writer.newLine();
                    }
                }
            }
        }
        writer.close();
    }

    private boolean isHave(final String str) throws IOException {
        final BufferedReader reader = new BufferedReader(new FileReader(filePathOut));
        while (reader.ready()) {
            if (str.equals(reader.readLine())) {
                return false;
            }
        }
        return true;
    }
}
