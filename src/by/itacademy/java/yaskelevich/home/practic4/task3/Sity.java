package by.itacademy.java.yaskelevich.home.practic4.task3;

public class Sity {
    private String sityName;
    private double square;

    public Sity() {

    }

    public Sity(final String sityName) {
        this.sityName = sityName;
    }

    public Sity(final Sity sity) {
        this.sityName = sity.getSityName();
        this.square = sity.getSquare();
    }

    public Sity(final String sityName, final double square) {
        this.sityName = sityName;
        this.square = square;
    }

    public void setSityName(final String sityName) {
        this.sityName = sityName;
    }

    public String getSityName() {
        return sityName;
    }

    public void setSquare(final double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }
}
