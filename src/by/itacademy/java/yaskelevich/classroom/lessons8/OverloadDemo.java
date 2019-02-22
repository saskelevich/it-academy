package by.itacademy.java.yaskelevich.classroom.lessons8;

public class OverloadDemo {
    public void test(final int a) {
        System.out.println();
    }

    public double test(final double a) {
        System.out.println("a = " + a);
        return a * a;
    }
}
