package by.itacademy.java.yaskelevich.home.practic4.task4;

public class Planet extends Mainland {
    private String namePlanet;
    private Mainland[] mainland;
    private Ocean[] ocean;
    private Island[] island;

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

    public Ocean[] getOcean() {
        return ocean;
    }

    public void setOcean(final Ocean[] ocean) {
        this.ocean = ocean;
    }

    public Island[] getIsland() {
        return island;
    }

    public void setIsland(final Island[] island) {
        this.island = island;
    }

}
