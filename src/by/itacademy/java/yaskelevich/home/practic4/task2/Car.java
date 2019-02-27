package by.itacademy.java.yaskelevich.home.practic4.task2;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
public class Car {
    private String mark;
    private int fuel;

    public Car() {

    }

    public Car(final String mark) {
        this.mark = mark;
        fuel = 100;
    }

    private class Wheel {

        public void chengeWheel() {
            System.out.printf("\nWhell is change\n");
        }
    }

    private class Engine {
        private static final String START = "\nEngine start\n";
        private static final String STOP = "\nEngine stop\n";

        private void start() {
            System.out.println(START);

        }

        private void stop() {
            System.out.println(STOP);
        }
    }

    public void showMark() {
        System.out.printf("\nMark: %s\n", this.mark);
    }

    public void go() {
        new Engine().start();
        System.out.print("\nAuto go\n");
        this.fuel -= 5;
    }

    public void stop() {
        System.out.print("\nAuto stop\n");
        new Engine().stop();
    }

    public void fillCar() {
        if (this.fuel < 100) {
            this.fuel = 100;
            System.out.printf("\nIs ready, fuel = %d\n", this.fuel);
        } else {
            System.out.printf("\nNo need, fuel = %d\n", this.fuel);
        }
    }

    public void changeWheel() {
        new Wheel().chengeWheel();
    }
}
