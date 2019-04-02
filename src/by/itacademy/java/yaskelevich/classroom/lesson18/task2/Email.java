package by.itacademy.java.yaskelevich.classroom.lesson18.task2;

public class Email {
    private final int number;

    public Email() {
        this.number = Main.counter().incrementAndGet();
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Email#" + number;
    }

}
