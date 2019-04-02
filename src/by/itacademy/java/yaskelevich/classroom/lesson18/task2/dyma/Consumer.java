package by.itacademy.java.yaskelevich.classroom.lesson18.task2.dyma;

import java.util.Queue;

public class Consumer extends Thread {

    private static final int EMAIL_PROCESSING_PAUSE = 3000;

    private static final int NO_EMAIL_PAUSE = 10000;

    private final Queue<Email> queue;

    public Consumer(final Queue<Email> queue, final String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Email e;
            final String threadName = getName();
            synchronized (queue) {
                e = queue.poll();
            }
            if (e == null) {
                if (Task1.LIMIT_REACHED) {
                    Logger.printLine(String.format("%s остановлен в связи с достижением лимита", threadName));
                    return;
                }

                try {
                    Thread.sleep(NO_EMAIL_PAUSE);
                } catch (final InterruptedException e1) {
                    stopWork(true);
                    return;
                }
            } else {
                try {
                    Thread.sleep(EMAIL_PROCESSING_PAUSE);
                } catch (final InterruptedException e1) {
                    stopWork(false);
                    return;
                }

                Logger.printLine(String.format("%s обработал %s", threadName, e));
            }

        }
        stopWork(true);
    }

    private void stopWork(final boolean completedLastEmail) {
        final String threadName = getName();
        Logger.printLine(
                String.format("лишние Consumer объекты. Размер очереди=%s. Удален %s", queue.size(), threadName));

    }
}