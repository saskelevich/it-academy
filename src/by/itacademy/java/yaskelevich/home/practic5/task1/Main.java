package by.itacademy.java.yaskelevich.home.practic5.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final List<Car> list = new ArrayList<Car>() {
            {
                add(new Car("Dodge", (int) (Math.random() * 10000)));
                add(new Car("Bentley", (int) (Math.random() * 10000)));
                add(new Car("Chrysler", (int) (Math.random() * 10000)));
                add(new Car("Ford", (int) (Math.random() * 10000)));
                add(new Car("Audi", (int) (Math.random() * 10000)));
            }
        };

        Collections.sort(list);
        for (final Car car : list) {
            System.out.println(car);
        }

        System.out.println();

        Collections.sort(list, new Car.CarComparator());
        for (final Car car : list) {
            System.out.println(car);
        }

    }
}
