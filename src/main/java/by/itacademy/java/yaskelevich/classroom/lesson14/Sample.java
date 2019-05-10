package by.itacademy.java.yaskelevich.classroom.lesson14;

public class Sample {
    public static void main(final String[] args) {
        final byte[] bytes = { 0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21 };
        final String strInteger = new String(bytes);
        System.out.println(strInteger);
    }
}
