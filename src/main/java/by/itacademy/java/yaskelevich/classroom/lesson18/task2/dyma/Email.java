package by.itacademy.java.yaskelevich.classroom.lesson18.task2.dyma;

import java.util.concurrent.atomic.AtomicInteger;

public class Email {

    private static final int EMAIL_LIMIT = 50;

    private static AtomicInteger COUNTER = new AtomicInteger();

    private final int number;

    public Email() {
        number = COUNTER.incrementAndGet();

        if (number == EMAIL_LIMIT) { // FIXME issue with generating email 100x is possible
            Task1.LIMIT_REACHED = true;
        }
    }

    @Override
    public String toString() {
        return "письмо#" + number;
    }
}