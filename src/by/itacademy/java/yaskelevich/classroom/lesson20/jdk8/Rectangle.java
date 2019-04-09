package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

public interface Rectangle {
    static int squareStatic(final int a, final int b) {
        return a * b;
    }

    default int squareDefault(final int a, final int b) {
        return a * b;
    }
}
