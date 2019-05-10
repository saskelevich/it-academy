package by.itacademy.java.yaskelevich.classroom.lesson16;

public class RunThread2 {
    public static void main(final String[] args) {
        final Hellorunnable hellorunnable = new Hellorunnable();
        final Thread thread = new Thread(hellorunnable);
        thread.start();
    }

    public static class Hellorunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from a thread");
        }
    }
}
