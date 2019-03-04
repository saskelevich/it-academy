package by.itacademy.java.yaskelevich.home.practic4.task3.task3v1;

public class Runner {
    public static void main(final String[] args) {
//        ati();
        final Land land = new Land();

        land.setName("Belarus");

        land.setCapital(new City());
        land.getCapital().setName("Minsk");
        land.setRegion(writeArray());

        land.setSquare(207617.26);

        System.out.printf("Capital: %s", land.getCapital().getName());
        System.out.printf("\nRegion quantity: %d", land.getRegion().length);
        System.out.printf("\nSquare: %.2f", land.getSquare());
        for (final Region region : land.getRegion()) {
            System.out.printf("\n%s, capital: %s", region.getName(), region.getCapital().getName());
        }
    }

    private static Region[] writeArray() {
        final Region[] region = new Region[] {new Region(), new Region(), new Region(),
                new Region(), new Region(), new Region()};
        region[0].setName("Grodno Region");
        region[0].setCapital(new City());
        region[0].getCapital().setName("Grodno");
        region[1].setName("Minsk Region");
        region[1].setCapital(new City());
        region[1].getCapital().setName("Minsk");
        region[2].setName("Brest Region");
        region[2].setCapital(new City());
        region[2].getCapital().setName("Brest");
        region[3].setName("Gomel Region");
        region[3].setCapital(new City());
        region[3].getCapital().setName("Gomel");
        region[4].setName("Mogilev Region");
        region[4].setCapital(new City());
        region[4].getCapital().setName("Mogilev");
        region[5].setName("Vitebsk Region");
        region[5].setCapital(new City());
        region[5].getCapital().setName("Vitebsk");
        return region;
    }

    private static void ati() {
        final District dis = new District();
        dis.setName("Grodno");
        System.out.println(dis.getName());
    }
}
