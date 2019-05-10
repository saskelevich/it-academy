package by.itacademy.java.yaskelevich.home.practic4.task4;

//4. Создать объект класса Планета, используя классы Материк, Океан, Остров.
//Методы: вывести на консоль название материка, планеты, количество материков
public class Runner {
    public static void main(final String[] args) {
        final Planet planet = new Planet();

        planet.setName("Earth");
        planet.setMainland(new Mainland[] {new Mainland("Eurasia"), new Mainland("Australia"),
                new Mainland("America")});

        System.out.printf("Mainland name: %s", planet.getMainland()[0].getName());
        System.out.printf("\nPlanet name: %s", planet.getName());
        System.out.printf("\nMainland quantity: %d", planet.getMainland().length);
    }
}
