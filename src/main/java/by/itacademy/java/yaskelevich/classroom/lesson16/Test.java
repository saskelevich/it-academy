package by.itacademy.java.yaskelevich.classroom.lesson16;

public class Test {
    public static void main(final String[] args) {
        int threadCount = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - startTime < 500) {
                continue;
            }
            new SleepingThread("SleepingThread" + (++threadCount)).start();
            startTime = System.currentTimeMillis();
        }
    }

    private static class SleepingThread extends Thread {

        public SleepingThread(final String name) {
            super(name);
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            while (true) {
                try {
                    if (System.currentTimeMillis() - startTime < 5000) {
                        continue;

                    }
                    Thread.sleep(10000);
                    startTime = System.currentTimeMillis();
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
