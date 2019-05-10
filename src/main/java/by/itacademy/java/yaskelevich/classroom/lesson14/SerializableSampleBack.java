package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableSampleBack {
    public static void main(final String[] args) throws Exception {

        final FileInputStream fis = new FileInputStream("t.tmp");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final int i = ois.readInt();
        final String today = (String) ois.readObject();
        final Car date = (Car) ois.readObject();
        ois.close();
        System.out.println(i);
        System.out.println(today);
        System.out.println(date);

    }
}
