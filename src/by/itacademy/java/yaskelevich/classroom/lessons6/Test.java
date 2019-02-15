package by.itacademy.java.yaskelevich.classroom.lessons6;

public class Test {
    private static int staticField;
    private int nonStaticField;

    public static void main(final String[] args) {
        doStatic();
        // doNoStatic();

        System.out.println(staticField);
        // System.out.println(nonStaticField);

        final Test objectInstance = new Test();
        System.out.println(objectInstance.nonStaticField);
        System.out.println(objectInstance.staticField);
        objectInstance.doStatic();
        objectInstance.doNonStatic();
    }

    private static void doStatic() {

    }

    private void doNonStatic() {

    }
}
