package by.itacademy.java.yaskelevich.classroom.lessons6;

public class Car {
    private static class Car1 {
        public static int staticField;
        public int nonStaticField;

        @Override
        public String toString() {
            return "Car{" + "nonStaticField=" + nonStaticField + " static field=" + staticField + '}';
        }
    }

    public static void main(final String[] args) {
        final Car1 car1 = new Car1();
        final Car1 car2 = new Car1();
        System.out.println("Car1 = " + car1);
        System.out.println("Car2 = " + car2);
        System.out.println("+1 both properties in both objects");
        car1.nonStaticField++;
        Car1.staticField++;
        car2.nonStaticField++;
        Car1.staticField++;
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);

    }
}
