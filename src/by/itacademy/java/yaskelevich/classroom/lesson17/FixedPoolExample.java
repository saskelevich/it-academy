package by.itacademy.java.yaskelevich.classroom.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolExample {
    public static void main(final String[] args) {
        final ExecutorService poolExecutor = Executors.newFixedThreadPool(2);
        final Task t1 = new Task("t1", 4000);
        final Task t2 = new Task("t2", 9000);
        final Task t3 = new Task("t3", 3000);
        poolExecutor.submit(t1);
        poolExecutor.submit(t2);
        poolExecutor.submit(t3);
        poolExecutor.shutdown();
    }

    public static class Task implements Runnable {
        private final String name;
        private final int pause;

        public Task(final String name, final int pause) {
            this.name = name;
            this.pause = pause;
        }

        @Override
        public void run() {
            System.out.printf("Executing task %s inside %s %n", name, Thread.currentThread().getName());
            try {
                Thread.sleep(pause);
                System.out.printf("task %s completed %n", name);

            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}