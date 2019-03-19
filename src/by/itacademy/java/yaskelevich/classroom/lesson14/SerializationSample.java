package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationSample {
    public static void main(final String[] args) throws IOException {

        final FileOutputStream fos = new FileOutputStream("t.tmp");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Car());
        oos.close();
    }
}
