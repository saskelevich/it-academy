package by.itacademy.java.yaskelevich.classroom.lesson18.task2.dyma;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    private static final Random RND = new Random();

    private final Queue<Email> queue;

    public Producer(final Queue<Email> queue, final String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        final String threadName = getName();
        while (true) {
            if (Task1.LIMIT_REACHED) {
                Logger.printLine(String.format("%s остановлен в связи с достижением лимита", threadName));
                return;
            }

            final int count = RND.nextInt(2) + 1;

            for (int i = 0; i < count; i++) {
                final Email e = new Email();
                queue.add(e);

                Logger.printLine(String.format("%s создал %s", threadName, e));
            }

            final int pause = (RND.nextInt(2) + 3) * 1000;
            try {
                Thread.sleep(pause);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}