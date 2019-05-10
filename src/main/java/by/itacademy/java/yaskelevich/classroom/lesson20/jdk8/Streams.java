package by.itacademy.java.yaskelevich.classroom.lesson20.jdk8;

import java.util.Arrays;
import java.util.Collection;

public class Streams {
    private enum Status {
        OPEN, CLOSED
    }

    private final Status status;
    private final Integer points;

    public Streams(final Status status, final Integer points) {
        this.status = status;
        this.points = points;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPoints() {
        return points;
    }

    public static void main(final String[] args) {
        final Collection<Streams> tasks = Arrays.asList(new Streams(Status.OPEN, 5),
                new Streams(Status.OPEN, 13), new Streams(Status.CLOSED, 8));
        final long totalPointsOfOpenTasks = tasks.stream()
                .filter(task -> task.getStatus() == Status.OPEN)
                // final long totalPointsOfOpenTasks = tasks.stream().parallel().filter(task ->
                // task.getStatus() == Status.OPEN)
                .mapToInt(Streams::getPoints).sum();
        System.out.printf("Total points: %s", totalPointsOfOpenTasks);

    }
}