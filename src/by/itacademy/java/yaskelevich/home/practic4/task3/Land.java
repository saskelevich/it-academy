package by.itacademy.java.yaskelevich.home.practic4.task3;

public class Land extends Region {
    private int sumRegion;
    private Sity[] regionCentr;
    private Sity capital;

    public Land() {
    }

    public void setSumRegion(final int sumRegion) {
        this.sumRegion = sumRegion;
    }

    public int getSumRegion() {
        return sumRegion;
    }

    public void setRegionCentr(final Sity[] areaCentr) {
        this.regionCentr = areaCentr;
    }

    public Sity[] getRegionCentr() {
        return regionCentr;
    }

    public Sity getCapital() {
        return capital;
    }

    public void setCapital(final Sity capital) {
        this.capital = capital;
    }
}