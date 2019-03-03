package by.itacademy.java.yaskelevich.home.practic4.task4;

public class Planet extends Mainland {
    private String namePlanet;
    private Mainland[] mainland;

    public Planet() {
    }

    public Planet(final String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(final String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public Mainland[] getMainland() {
        return mainland;
    }

    public void setMainland(final Mainland[] mainland) {
        this.mainland = mainland;
    }

}
