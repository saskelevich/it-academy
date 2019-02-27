package by.itacademy.java.yaskelevich.home.practic4.task3.v1;

public class Runner {
    public static void main(final String[] args) {
        final Land land = new Land("Belarus", 207.6d, "Minsk", 118, 6);
        land.setRegionCentr(
                new String[] {"Grodno", "Minsk", "Mogilev", "Gomel", "Brest", "Vitebsk"});

        System.out.printf("Stolica: %s\n", land.getCentr());
        System.out.printf("Region: %d\n", land.getSumRegion());
        System.out.printf("Square: %.1f\n", land.getSquare());
        System.out.print("Region Center:\n");
        for (final String sity : land.getRegionCentr()) {
            System.out.printf("-%s\n", sity);
        }
    }

}
