package by.itacademy.java.yaskelevich.home.practic4.task3.v1;

public class Area extends Sity {
    private String centr;

    public Area() {

    }

    public Area(final Area area) {
        super(area);
        this.centr = area.getCentr();
    }

    public Area(final String name, final double square, final String centr) {
        super(name, square);
        this.centr = centr;
    }

    public void setCentr(final String centr) {
        this.centr = centr;
    }

    public String getCentr() {
        return centr;
    }
}
