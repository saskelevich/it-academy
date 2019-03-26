package by.itacademy.java.yaskelevich.classroom.lesson16.horse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final List<ThreadHorse> horses = new ArrayList<ThreadHorse>();
        final Horse hr = new Horse();

        for (int i = 0; i < 28; i++) {
            horses.add(new ThreadHorse(i, hr));
        }
        for (int i = 0; i < 28; i++) {
            horses.get(i).start();
        }
    }
}
