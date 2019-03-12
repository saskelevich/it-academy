package by.itacademy.java.yaskelevich.classroom.lessons12;

public class TestException {
    public static void main(final String[] args) {
        System.out.println("start main");
        try {
            method1();
            System.out.println("end of try section");
        } catch (final NullPointerException | IllegalAccessException exc) {
            // System.out.println("exception caught" + exc);
            exc.printStackTrace();
        } catch (final Exception exc) {
            exc.printStackTrace();
            // System.out.println("exception caught" + exc);
        } finally {
            System.out.println("fynally");
        }
        System.out.println("end main");
    }

    private static void method1() throws Exception {
        System.out.println("start method1");
        method2();
        System.out.println("end method1");
    }

    private static void method2() throws Exception {
        System.out.println("start method2");
        method3();
        System.out.println("end method2");
    }

    private static void method3() throws Exception {
        System.out.println("start method3");
        if (true) {
            throw new Exception("my exception");
        }
        System.out.println("end method3");
    }
}
