package by.itacademy.java.yaskelevich.home.practic4.task3.v1;

public class Region extends Area {
    private int sumArea;
    private Area[] areaNames;

    public Region() {
        // TODO Auto-generated constructor stub
    }

    public Region(final Region region) {
        super(region);
        this.sumArea = region.getSumArea();
        this.areaNames = region.getAreaNames();
    }

    public Region(final String name, final double square, final String centr, final int sumArea) {
        super(name, square, centr);
        this.sumArea = sumArea;
    }

    public void setSumArea(final int sumArea) {
        this.sumArea = sumArea;
    }

    public int getSumArea() {
        return sumArea;
    }

    public void setAreaNames(final Area[] areaNames) {
        this.areaNames = areaNames;
    }

    public Area[] getAreaNames() {
        return areaNames;
    }
}
