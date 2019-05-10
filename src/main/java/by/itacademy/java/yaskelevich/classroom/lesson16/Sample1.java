
package by.itacademy.java.yaskelevich.classroom.lesson16;

import java.util.concurrent.atomic.AtomicLong;

public class Sample1 {
    public static void main(final String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            final CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter: " + counter.getCounter());
    }

    static class Counter {
        // private long counter = 0L;
        //
        // public void increaseCounter() {
        // counter++;
        // }
        //
        // public long getCounter() {
        // return counter;
        // }

        // private volatile long counter = 0L;
        //
        // public void increaseCounter() {
        // counter++;
        // }
        //
        // public long getCounter() {
        // return counter;
        // }

        // private long counter = 0L;
        //
        // public synchronized void increaseCounter() {
        // counter++;
        // }
        //
        // public long getCounter() {
        // return counter;
        // }

        private final AtomicLong counter = new AtomicLong(0);

        public void increaseCounter() {
            counter.incrementAndGet();
        }

        public AtomicLong getCounter() {
            return counter;
        }
    }

    static class CounterThread extends Thread {
        private final Counter counter;

        public CounterThread(final Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increaseCounter();
            }
        }
    }
}
