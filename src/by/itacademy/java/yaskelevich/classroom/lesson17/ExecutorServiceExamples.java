package by.itacademy.java.yaskelevich.classroom.lesson17;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExamples {
    public static void main(final String[] args) {
        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        executorService.schedule(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Executed after delay!");
                return "Called";
            }
        }, 2, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executed periodically!");
            }
        }, 4, 2, TimeUnit.SECONDS);
    }
}
