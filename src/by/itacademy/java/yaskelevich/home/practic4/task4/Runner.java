package by.itacademy.java.yaskelevich.home.practic4.task4;

//4. Создать объект класса Планета, используя классы Материк, Океан, Остров.
//Методы: вывести на консоль название материка, планеты, количество материков
public class Runner {
    public static void main(final String[] args) {

        final Planet planet = new Planet();

        planet.setMainland(new Mainland[] {new Mainland("Eurasia"), new Mainland("America"),
                new Mainland("Africa")});
        planet.setNamePlanet("Eart");

        System.out.println(planet.getMainland()[0].getNameMainland());
        System.out.println(planet.getNamePlanet());
        System.out.println(planet.getMainland().length);
    }

}
