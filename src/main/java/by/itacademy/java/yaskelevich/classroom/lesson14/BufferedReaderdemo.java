package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderdemo {
    public static void main(final String[] args) throws IOException {
        String thisLine = null;
        try (FileReader reader = new FileReader("input.txt"); BufferedReader br = new BufferedReader(reader);) {
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        }

        System.err.close();
        throw new RuntimeException();
    }
}
