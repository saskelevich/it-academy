package by.itacademy.java.yaskelevich.classroom.lesson14;

public class ByteArrayToString {
    public static void main(final String[] args) {
        final byte[] byteArray = { 65, 66, 67 };
        final String strInteger = new String(byteArray);
        System.out.println(strInteger);
    }
}
