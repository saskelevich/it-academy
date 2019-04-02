package by.itacademy.java.yaskelevich.classroom.lesson18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(final String[] args) throws InterruptedException {
        final List<Horse> list = new ArrayList<>();

        final int horseLength = horseLength();

        for (int i = 0; i < horseLength; i++) {
            list.add(new Horse("№" + i));
            list.get(i).start();
        }

        while (true) {
            printHorsesStatus(list);
            Thread.sleep(1000);
        }
    }

    private static int horseLength() {
        return new Random().nextInt(7) + 3;
    }

    private static void printHorsesStatus(final List<Horse> list) {

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        for (final Horse horse : list) {
            if (horse.isAlive()) {
                final StringBuilder sb = new StringBuilder();

                for (int i = 0; i < horse.getSteps(); i++) {
                    sb.append("-");
                }
                sb.append(">" + horse.getName());
                System.out.print(sb);
                for (int i = 0; i < (Horse.FINISH - sb.length()); i++) {
                    System.out.print("_");
                }
                System.out.println();
            } else {
                System.out.println(horse.getName() + " Time: " + TimeUnit.MILLISECONDS.toSeconds(horse.getTimer()));
            }
        }

    }

}