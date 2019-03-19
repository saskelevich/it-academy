package by.itacademy.java.yaskelevich.home.practic5.task1;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private final String brand;
    private final int cost;

    public Car(final String brand, final int cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car [brand=" + getBrand() + ", cost=" + getCost() + "]";
    }

    @Override
    public int compareTo(final Car o) {
        return getBrand().compareTo(o.getBrand());
    }

    static class CarComparator implements Comparator<Car> {

        @Override
        public int compare(final Car o1, final Car o2) {
            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }
            return o1.getCost() - o2.getCost();
        }
    }

}
