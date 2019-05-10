package by.itacademy.java.yaskelevich.classroom.lessons8;

public class Test {
    int i;

    public static void main(final String[] args) {
        final Test o1 = new Test(1);
        final Test o2 = new Test(2);
    }

    public Test(final int i) {
        this.i = i;
        System.out.println("constructor: " + i);
    }

    {
        System.out.println("block initialization object:" + i);
    }

    static {
        System.out.println("static block initialization class");
        System.exit(0);
    }
}
