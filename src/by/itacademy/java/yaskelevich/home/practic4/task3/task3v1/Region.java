package by.itacademy.java.yaskelevich.home.practic4.task3.task3v1;

public class Region {
    private String name;
    private double square;
    private City capital;
    private District[] district;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(final double square) {
        this.square = square;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(final City capital) {
        this.capital = capital;
    }

    public District[] getDistrict() {
        return district;
    }

    public void setDistrict(final District[] district) {
        this.district = district;
    }

}
