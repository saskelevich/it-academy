package by.itacademy.java.yaskelevich.home.practic4.task2;

public class Car {
    public static final int MAX_TANK_VOLUM = 100;

    private Engine engine;
    private Wheel[] wheel;
    private String brand;
    private int tank;

    public Car() {
        this.tank = MAX_TANK_VOLUM;
    }

    public Car(final String brand) {
        this.tank = MAX_TANK_VOLUM;
        engine = new Engine();
        wheel = new Wheel[4];
        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = new Wheel();
        }
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(final Wheel[] wheel) {
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public double getTank() {
        return tank;
    }

    public void go() {
        if (engine.start()) {
            this.tank -= 10;
            System.out.println("Go");
        } else {
            System.out.println("The car would not start");
        }
    }

    public void fillCar() {
        if (this.tank < MAX_TANK_VOLUM) {
            System.out.printf("\nIs ready, fuel = %d\n", this.tank);
        } else {
            System.out.printf("\nNo need, fuel = %d\n", this.tank);
        }
    }

    public void chengeWheel(final int index) {
        if (index > wheel.length) {
            wheel[index - 1] = new Wheel();
            System.out.printf("\nWhell is change\n");
        } else {
            System.out.println("No such wheel");
        }

    }
}
