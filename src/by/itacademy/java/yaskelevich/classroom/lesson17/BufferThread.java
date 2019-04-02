package by.itacademy.java.yaskelevich.classroom.lesson17;

public class BufferThread {
    static int counterA = 0;
    static int counterB = 0;
//    static StringBuffer s = new StringBuffer();
    static StringBuilder s = new StringBuilder();

    public static void main(final String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                synchronized (s) {
                    while (counterA < 3) {
                        s.append("A");
                        System.out.println("> " + counterA + " " + s);
                        try {
                            Thread.sleep(500);
                        } catch (final InterruptedException e) {
                            e.printStackTrace();
                        }
                        counterA++;
                    }
                }
            }
        }.start();
        Thread.sleep(100);
        synchronized (s) {
            while (counterB < 3) {
                s.append("B");
                System.out.println("< " + counterB + " " + s);
                try {
                    Thread.sleep(500);
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
                counterB++;
            }
        }
    }
}

//> 0 A
//> 1 AA
//> 2 AAA
//< 0 AAAB
//< 1 AAABB
//< 2 AAABBB

//> 0 A
//< 0 AB
//< 1 ABB
//< 2 ABBB
//> 1 ABBBA
//> 2 ABBBAA
