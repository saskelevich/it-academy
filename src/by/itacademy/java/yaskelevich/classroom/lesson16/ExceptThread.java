package by.itacademy.java.yaskelevich.classroom.lesson16;

public class ExceptThread {
    public static void main(final String[] args) throws InterruptedException {
        new ExceptThread1().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}

class ExceptThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Start ExceptThread1");
        final boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of Exception");
    }
}
