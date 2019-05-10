package by.itacademy.java.yaskelevich.classroom.lesson17;

class JoinRunners extends Thread {

    public JoinRunners(final String name) {
        super(name);
    }

    @Override
    public void run() {
        final String threadName = getName();
        long timeout = 0;
        System.out.println("Start stream " + threadName);
        try {
            switch (threadName) {
            case "1":
                timeout = 5_000;
                break;
            case "2":
                timeout = 1000;
                break;
            }
            Thread.sleep(timeout);
            System.out.println("end stream " + threadName);

        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class JoinRunner {
    public static void main(final String[] args) {
        System.out.println("Start stream main");
        final Thread t1 = new JoinRunners("1");
        final Thread t2 = new JoinRunners("2");
        t1.start();
        t2.start();
        try {
            t1.join(500);
        } catch (final InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.println("end stream main");
    }
}
