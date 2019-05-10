package by.itacademy.java.yaskelevich.classroom.lesson18.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class MainThread implements Runnable {
    private final Queue<Consumer> threads;
    private final Queue<Email> emails;
    private final Thread thread;
    private int id = -1;

    public MainThread(final Queue<Email> emails) {
        threads = new LinkedList<>();
        this.emails = emails;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        // final Producer producer = new Producer("Producer#1", emails);
        // final Producer producer = new Producer("Producer#1", emails);
        while (true) {
            if (emails.size() >= 20) {
                final Consumer consumer = new Consumer(emails, ("Consumer" + returnId()));
                threads.add(consumer);
                System.out.printf("%s - Size = %d. Create %s\n", LogPrinter.log(), emails.size(),
                        consumer);
            }
            if (emails.size() <= 10) {
                System.out.printf("%s - Size = %d. Delete %s\n", LogPrinter.log(), emails.size(),
                        threads.poll());
            } else {
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int returnId() {
        return this.id++;
    }
}
