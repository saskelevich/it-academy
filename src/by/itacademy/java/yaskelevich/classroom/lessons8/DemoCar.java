package by.itacademy.java.yaskelevich.classroom.lessons8;

public class DemoCar {
    public static void main(final String[] args) {
        Car car = new PassengerCar();
        car.move();

        car = new Truck();
        car.move();
    }
}
