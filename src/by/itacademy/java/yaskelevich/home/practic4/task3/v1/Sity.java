package by.itacademy.java.yaskelevich.home.practic4.task3.v1;

public class Sity {
    private String name;
    private double square;

    public Sity() {

    }

    public Sity(final Sity sity) {
        this.name = sity.getName();
        this.square = sity.getSquare();
    }

    public Sity(final String name, final double square) {
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
