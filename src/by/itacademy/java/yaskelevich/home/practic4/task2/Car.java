package by.itacademy.java.yaskelevich.home.practic4.task2;

public class Car extends Wheel {
    private String brand;
    private int fuel;

    public Car() {

    }

    public Car(final String mark) {
        this.brand = mark;
        fuel = 100;
    }

    private class Engine {

        private void start() {
            System.out.printf("Engine start");

        }

        private void stop() {
            System.out.printf("Engine stop");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(final int fuel) {
        this.fuel = fuel;
    }

    public void showBrand() {
        System.out.printf("\nMark: %s\n", this.brand);
    }

    public void go() {
        System.out.println();
        new Engine().start();
        System.out.print("\nAuto go\n");
        this.fuel -= 5;
    }

    public void stop() {
        System.out.print("\nAuto stop\n");
        new Engine().stop();
        System.out.println();
    }

    public void fillCar() {
        if (this.fuel < 100) {
            this.fuel = 100;
            System.out.printf("\nIs ready, fuel = %d\n", this.fuel);
        } else {
            System.out.printf("\nNo need, fuel = %d\n", this.fuel);
        }
    }
}
