package by.itacademy.java.yaskelevich.classroom.lesson18.task2;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

//Consumer - это поток, который берет письма из очереди (по одному), при их наличии, и тратит на обработку ровно 3 секунды. Обработка письма - это просто печать текста в консоль без реальной отсылки.
//Если писем нет, то Consumer засыпает на 10 секунд.
public class Consumer implements Runnable {
    private final Thread thread;
    private final Queue<Email> list;

    public Consumer(final Queue<Email> list, final String name) {
        this.list = list;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        while (!thread.isAlive()) {
            if (!list.isEmpty()) {
                System.out.printf("%s - %s get %s\n", LogPrinter.log(), Thread.currentThread(),
                        listPoll());
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private Email listPoll() {
        synchronized (list) {
            return list.poll();
        }
    }
}
