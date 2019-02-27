package by.itacademy.java.yaskelevich.home.practic4.task4.v1;

//4. Создать объект класса Планета, используя классы Материк, Океан, Остров.
//Методы: вывести на консоль название материка, планеты, количество материков
public class Planet {
    private String namePlanet;
    private Mainland[] mainland;

    public Planet() {
    }

    public Planet(final String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public final class Mainland {
        private String nameMainland;

        public Mainland() {
        }

        public Mainland(final String nameMainland) {
            this.nameMainland = nameMainland;
        }

        @Override
        public String toString() {
            return nameMainland;
        }
    }

    private final class Ocean {
        private final String nameOcean;

        private Ocean(final String nameOcean) {
            this.nameOcean = nameOcean;
        }

        private final class Island {
            private final String nameIsland;

            private Island(final String nameIsland) {
                this.nameIsland = nameIsland;
            }
        }
    }

    public void setNamePlanet(final String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public int getSumMainlang() {
        return this.mainland.length;
    }

    public void setMainland(final String... mainland) {
        this.mainland = new Mainland[mainland.length];
        for (int i = 0; i < this.mainland.length; i++) {
            this.mainland[i] = new Mainland(mainland[i]);
        }
    }

    public Mainland[] getMainland() {
        return mainland;
    }
}
