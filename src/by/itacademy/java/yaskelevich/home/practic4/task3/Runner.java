package by.itacademy.java.yaskelevich.home.practic4.task3;

//3. Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Runner {
    public static void main(final String[] args) {
        final Land land = new Land();

        land.setCapital(new Sity("Minsk", 207.6d));
        land.setSumRegion(6);
        land.setSquare(118.6);
        land.setRegionCentr(new Sity[] {new Sity("Minsk"), new Sity("Grodno"), new Sity("Brest"),
                new Sity("Gomel"), new Sity("Mogilev"), new Sity("Vitebsk")});

        System.out.printf("Capital: %s\n", land.getCapital().getSityName());
        System.out.printf("Region: %d\n", land.getSumRegion());
        System.out.printf("Square: %.1f\n", land.getSquare());
        System.out.print("Region Center:\n");
        for (final Sity sity : land.getRegionCentr()) {
            System.out.printf("-%s\n", sity.getSityName());
        }
    }

}
