package by.itacademy.java.yaskelevich.home.practic4.task4.v1;

public class Runner {
    public static void main(final String[] args) {
        final Planet planet = new Planet();
        planet.setNamePlanet("Eart");
        planet.setOcean(new Ocean[] {new Ocean("Tixiy"), new Ocean("Atlantic")});
        planet.setMainland(new Mainland[] {new Mainland("Europa"), new Mainland("Asia"),
                new Mainland("America"), new Mainland("Africa")});
        planet.setIsland(new Island[] {new Island("Madagaskar"), new Island("Socotra")});

    }

}
