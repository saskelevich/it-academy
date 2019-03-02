package by.itacademy.java.yaskelevich.home.practic4.task4.v1;

//4. Создать объект класса Планета, используя классы Материк, Океан, Остров.
//Методы: вывести на консоль название материка, планеты, количество материков
public class Planet extends Ocean {
    private String namePlanet;
    private Ocean[] ocean;
    private Mainland[] mainland;
    private Island[] island;

    public Planet() {
        // TODO Auto-generated constructor stub
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

    public Ocean[] getOcean() {
        return ocean;
    }

    public void setOcean(final Ocean[] ocean) {
        this.ocean = ocean;
    }

    public Mainland[] getMainland() {
        return mainland;
    }

    public void setMainland(final Mainland[] mainland) {
        this.mainland = mainland;
    }

    public Island[] getIsland() {
        return island;
    }

    public void setIsland(final Island[] island) {
        this.island = island;
    }
}
