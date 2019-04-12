package by.itacademy.java.yaskelevich.classroom.lesson21.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyData {
    public static void main(final String[] args) throws ParseException {
        final Locale locale = new Locale("en", "US");
        final NumberFormat format = NumberFormat.getInstance(locale);
        final Number number = format.parse("10,5");
        System.out.println(number.doubleValue());
    }
}
