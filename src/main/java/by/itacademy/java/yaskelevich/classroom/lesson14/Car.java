package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = -8706553341097740635L;
    private final String str;
    private final int in;
    private final transient InputStream is = new ByteArrayInputStream(new byte[] {});

    public Car() {
        in = 0;
        str = null;
    }

    public Car(final int in, final String str) {
        this.in = in;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Car [str=" + str + ", in=" + in + ", getClass()=" + getClass().getSimpleName() + "]";
    }

}
