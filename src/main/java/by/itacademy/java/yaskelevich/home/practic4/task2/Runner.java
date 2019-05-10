package by.itacademy.java.yaskelevich.home.practic4.task2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Runner {
    public static void main(final String[] args) {
        final Car car = new Car("Car model");

        car.go();
        car.fillCar();
        car.chengeWheel(4);
        System.out.printf("Brand - %s", car.getBrand());
    }
}
