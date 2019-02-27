package by.itacademy.java.yaskelevich.home.practic4.task2;

public class Runner {
    public static void main(final String[] args) {
        final Car car = new Car("BMW");
        car.showMark();
        car.changeWheel();
        car.fillCar();
        car.go();
        car.stop();
        car.fillCar();
    }
}
