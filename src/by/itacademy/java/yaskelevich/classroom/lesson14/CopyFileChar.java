package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyFileChar {
    public static void main(final String[] args) throws IOException {

        try (Reader in = new FileReader("input.txt"); Writer out = new FileWriter("output.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
