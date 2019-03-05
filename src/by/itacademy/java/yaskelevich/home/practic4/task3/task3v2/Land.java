package by.itacademy.java.yaskelevich.home.practic4.task3.task3v2;

public class Land {
    private String name;
    private City capital;
    private Region[] region;
    private double square;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(final City capital) {
        this.capital = capital;
    }

    public Region[] getRegion() {
        return region;
    }

    public void setRegion(final Region[] region) {
        this.region = region;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(final double square) {
        this.square = square;
    }

}
