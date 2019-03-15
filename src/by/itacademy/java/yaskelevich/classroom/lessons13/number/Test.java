package by.itacademy.java.yaskelevich.classroom.lessons13.number;

public class Test {
    public static void main(final String[] args) {
        final int n = 287;
        test(2, n);
    }

    private static void test(final int m, final int n) {
        final int delta = n % m;
        if (n == m) {
            System.out.println("Yes");
            return;
        }
        if (delta == 0) {
            System.out.println("No");
        } else {
            test(m + 1, n);
        }
    }
}
