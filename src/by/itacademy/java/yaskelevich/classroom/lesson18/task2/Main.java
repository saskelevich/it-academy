package by.itacademy.java.yaskelevich.classroom.lesson18.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Queue<Email> emails = new LinkedList<>();
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    private static int id = -1;

    public static void main(final String[] args) {
        new MainThread(emails);
    }

    public static synchronized AtomicInteger counter() {
        return atomicInteger;
    }

}