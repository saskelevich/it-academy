package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParalelStreamsPerfomance {
    public static void main(final String[] args) {
        final List<String> values = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            final UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        sortSequential(values);
        sortParallel(values);
    }

    public static void sortSequential(final List<String> values) {
        final long t0 = System.nanoTime();
        values.stream().sorted().count();
        System.out.printf("sort took: %d ns %n", System.nanoTime() - t0);

    }

    private static void sortParallel(final List<String> values) {
        final long t0 = System.nanoTime();
        values.parallelStream().sorted().count();
        System.out.printf("Parallel sort took: %d ns %n", System.nanoTime() - t0);
    }
}