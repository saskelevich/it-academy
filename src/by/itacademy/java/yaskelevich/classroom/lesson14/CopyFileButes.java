package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileButes {
    public static void main(final String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
