package by.itacademy.java.yaskelevich.classroom.lessons7;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(final String[] args) {
        final Date date = new Date();
        System.out.println(date);
        final Calendar anotherDate = Calendar.getInstance();
        System.out.printf("%s vs %s", date.getTime(), anotherDate.getTime());
        anotherDate.add(Calendar.DAY_OF_YEAR, -3);
        anotherDate.add(Calendar.SECOND, -4);
        System.out.println("\nshifted:" + anotherDate.getTime());
    }
}
