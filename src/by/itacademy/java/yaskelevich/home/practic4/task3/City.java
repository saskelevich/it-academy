package by.itacademy.java.yaskelevich.home.practic4.task3;

public class City {
    private String name;
    private double square;

    public City() {

    }

    public City(final String name) {
        this.name = name;
    }

    public City(final String name, final double square) {
        this.name = name;
        this.square = square;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSquare(final double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }
}
