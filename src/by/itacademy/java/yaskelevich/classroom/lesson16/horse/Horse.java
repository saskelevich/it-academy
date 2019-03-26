package by.itacademy.java.yaskelevich.classroom.lesson16.horse;

public class Horse {

    public synchronized void runn(final String name, final int steps) {
        System.out.println();
        for (int i = 0; i < steps; i++) {
            System.out.print("-");
        }
        System.out.print("(" + name + ")>");
        if (steps > 99) {
            System.out.print("Finish");
        }
    }
}
