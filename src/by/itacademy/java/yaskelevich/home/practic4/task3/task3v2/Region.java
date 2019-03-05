package by.itacademy.java.yaskelevich.home.practic4.task3.task3v2;

public class Region extends AdminUnit {
    private City capital;
    private District[] district;

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
