package by.itacademy.java.yaskelevich.classroom.lesson18.task1;

import java.util.Date;
import java.util.Random;

public class Horse extends Thread {

    public static final int FINISH = 30;
    private static final int STEP_DELAY_MS = 1000;
    private int steps;
    private long timer;

    public Horse(final String name) {
        super(name);
    }

    @Override
    public void run() {
        timer = new Date().getTime();
        while (steps < FINISH) {
            steps += new Random().nextInt(3) + 1;
            try {
                Thread.sleep(STEP_DELAY_MS);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
        timer = new Date().getTime() - timer;
    }

    public int getSteps() {
        return steps;
    }

    public long getTimer() {
        return timer;
    }

}
