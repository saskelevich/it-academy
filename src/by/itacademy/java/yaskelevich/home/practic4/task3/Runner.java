package by.itacademy.java.yaskelevich.home.practic4.task3;

//3. Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Runner {
    public static void main(final String[] args) {
        final Land land = new Land();

        land.setCapital(new City("Minsk", 207.6d));
        land.setSumRegion(6);
        land.setSquare(118.6);
        land.setRegionCentr(new City[] {new City("Minsk"), new City("Grodno"), new City("Brest"),
                new City("Gomel"), new City("Mogilev"), new City("Vitebsk")});

        System.out.printf("Capital: %s\n", land.getCapital().getName());
        System.out.printf("Region: %d\n", land.getSumRegion());
        System.out.printf("Square: %.1f\n", land.getSquare());
        System.out.print("Region Center:\n");
        for (final City city : land.getRegionCentr()) {
            System.out.printf("-%s\n", city.getName());
        }
    }

}
