package by.itacademy.java.yaskelevich.classroom.lesson18.task2;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private final Thread thread;
    private final Random random = new Random();
    private final List<Email> list;

    public Producer(final String name, final List<Email> list) {
        this.list = list;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        while (list.get(list.size() - 1).getNumber() != 1000) {
            try {
                Thread.sleep(random.nextInt(3) + 1);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            final int lengthList = random.nextInt(3) + 1;
            for (int i = 0; i < lengthList; i++) {
                System.out.printf("%s - %s create %s\n", LogPrinter.log(), Thread.currentThread(),
                        cerate());
            }
        }
    }

    private Email cerate() {
        synchronized (list) {
            final Email email = new Email();
            list.add(email);
            return email;
        }
    }
}
