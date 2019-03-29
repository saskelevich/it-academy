package by.itacademy.java.yaskelevich.classroom.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(final String[] args) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        final Runnable task = new Runnable() {

            @Override
            public void run() {
                System.out.println("Execute task");
            }
        };
        singleThreadExecutor.submit(task);
        singleThreadExecutor.submit(task);
        singleThreadExecutor.submit(task);

        singleThreadExecutor.shutdown();
        // singleThreadExecutor.submit(task);
    }
}
