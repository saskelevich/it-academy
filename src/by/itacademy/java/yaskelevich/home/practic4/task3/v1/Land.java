package by.itacademy.java.yaskelevich.home.practic4.task3.v1;

public class Land extends Region {
    private int sumRegion;
    private String[] regionCentr;

    public Land() {
        // TODO Auto-generated constructor stub
    }

    public Land(final Land land) {
        super(land);
        this.sumRegion = land.getSumRegion();
        this.regionCentr = land.getRegionCentr();
    }

    public Land(final String name, final double square, final String centr, final int sumArea,
            final int sumRegion) {
        super(name, square, centr, sumArea);
        this.sumRegion = sumRegion;
        regionCentr = new String[sumRegion];
    }

    public void setSumRegion(final int sumRegion) {
        this.sumRegion = sumRegion;
    }

    public int getSumRegion() {
        return sumRegion;
    }

    public void setRegionCentr(final String[] areaCentr) {
        this.regionCentr = areaCentr;
    }

    public String[] getRegionCentr() {
        return regionCentr;
    }
}
