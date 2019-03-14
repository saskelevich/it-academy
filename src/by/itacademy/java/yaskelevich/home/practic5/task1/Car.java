package by.itacademy.java.yaskelevich.home.practic5.task1;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String brand;
    private int cost;

    public Car() {
    }

    public Car(final String brand, final int cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", cost=" + cost + "]";
    }

    @Override
    public int compareTo(final Car o) {
        return this.brand.compareTo(o.getBrand());
    }

    static class CarComparator implements Comparator<Car> {

        @Override
        public int compare(final Car o1, final Car o2) {
            return o1.getCost() - o2.getCost();
        }
    }
}
