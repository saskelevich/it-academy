package by.itacademy.java.yaskelevich.home.practic4.task4.v1;

public class Runner {
    public static void main(final String[] args) {
        final Planet planet = new Planet("Earth");
        planet.setMainland("America", "Australia", "Europa", "Asia", "Africa");

        System.out.println("Mainland names:");
        for (final Planet.Mainland main : planet.getMainland()) {
            System.out.println(main);
        }

        System.out.printf("\nSummary mainlands: %d\n", planet.getSumMainlang());
        System.out.printf("\nPlaneta name: %s\n", planet.getNamePlanet());
    }
}
