package by.itacademy.java.yaskelevich.classroom.lesson18.task2.dyma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task1 {
    public static boolean LIMIT_REACHED = false;

    private static final int CHECK_BALANCE_DELAY = 10000;

    private static final Queue<Email> queue = new LinkedList<>();

    private static List<Producer> PRODUCERS = new ArrayList<>();
    private static List<Consumer> CONSUMERS = new ArrayList<>();

    private static void startProducer() {
        final int nextNumber = PRODUCERS.size() + 1;
        final Producer producer = new Producer(queue, "Producer#" + nextNumber);
        PRODUCERS.add(producer);
        producer.start();

    }

    private static void startConsumer() {
        final int nextNumber = CONSUMERS.size() + 1;
        final Consumer consmer = new Consumer(queue, "Consumer#" + nextNumber);
        CONSUMERS.add(consmer);
        consmer.start();

        Logger.printLine(String.format("недостаточно Consumer объектов. Размер очереди=%s. Добавлен %s", queue.size(),
                consmer.getName()));
    }

    public static void main(final String[] args) throws InterruptedException {
        startProducer();
        startProducer();

        startConsumer();

        while (true) {
            if (LIMIT_REACHED) {
                Logger.printLine(
                        String.format("%s остановлен в связи с достижением лимита", Thread.currentThread().getName()));
                return;
            }

            if (queue.size() > 20) {
                startConsumer();
            } else if (queue.size() < 10 && CONSUMERS.size() > 1) {
                final int lastIndex = CONSUMERS.size() - 1;
                final Consumer consumer = CONSUMERS.get(lastIndex);
                consumer.interrupt();
            }
            Thread.sleep(CHECK_BALANCE_DELAY);
        }
    }
}
