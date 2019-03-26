package by.itacademy.java.yaskelevich.classroom.lesson16.horse;

import java.util.Random;

public class ThreadHorse extends Thread {
    private final Horse hr;
    Random rand = new Random();

    public ThreadHorse(final int name, final Horse hr) {
        super(name + "");
        this.hr = hr;
    }

    @Override
    public void run() {
        int steps = 0;
        while (steps < 100) {
            steps += rand.nextInt(3) + 1;
            hr.runn(this.getName(), steps);
            try {
                sleep(1000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            yield();
        }
    }
}
