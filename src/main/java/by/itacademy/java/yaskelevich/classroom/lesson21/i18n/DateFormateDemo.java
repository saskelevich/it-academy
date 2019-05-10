package by.itacademy.java.yaskelevich.classroom.lesson21.i18n;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormateDemo {
    public static void main(final String[] args) {
        final Locale locale = new Locale("ru", "RU");
        final Date date = new Date();
        // final DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(date));
    }
}
