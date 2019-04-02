package by.itacademy.java.yaskelevich.classroom.lesson17;

public class Interrupted extends Thread {
    private volatile boolean isIncrement = true;
    private volatile boolean toBeFinished = false;
    public int mValue = 0;

    public void changeAction() {
        isIncrement = !isIncrement;
    }

    public void finish() {
        this.toBeFinished = true;
    }

    @Override
    public void run() {
        System.out.print("Value =");
        do {
            // if (!toBeFinished) {
            if (!Thread.interrupted()) {
                if (isIncrement) {
                    mValue++;
                } else {
                    mValue--;
                }
                System.out.print(mValue + " ");
            } else {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
                System.out.println("Interrupted");
                return;
            }
        }
        while (true);
    }

    public static void main(final String[] args) {
        final Interrupted incrementatorThread = new Interrupted();
        incrementatorThread.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (final InterruptedException e) {

            }
            incrementatorThread.changeAction();
        }
        // incrementatorThread.finish();
        incrementatorThread.interrupt();
    }
}
