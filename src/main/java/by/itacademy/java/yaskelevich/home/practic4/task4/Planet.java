package by.itacademy.java.yaskelevich.home.practic4.task4;

public class Planet {
    private String name;
    private Mainland[] mainland;
    private Ocean[] ocean;
    private Island[] island;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
