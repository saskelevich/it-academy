package by.itacademy.java.yaskelevich.classroom.lesson17;

public class Payment {
    private int amount;

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public synchronized void doPayment() {
        System.out.println("Start payment. Waiting for amount");
        while (amount <= 0) {
            try {
                this.wait();
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Payment completed");
    }

    public static void main(final String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread() {
            @Override
            public void run() {
                payment.doPayment();
            }
        }.start();
        Thread.sleep(2000);

        synchronized (payment) {
            System.out.println("set payment and notify");
            Thread.sleep(2000);
            payment.setAmount(100);
            payment.notify();
        }

        synchronized (payment) {
            payment.wait(1000);
            System.out.println("OK");
        }
    }

}
