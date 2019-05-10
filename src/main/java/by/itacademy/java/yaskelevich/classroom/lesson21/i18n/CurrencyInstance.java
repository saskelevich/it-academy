package by.itacademy.java.yaskelevich.classroom.lesson21.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyInstance {
    public static void main(final String[] args) {
        final Locale locale = new Locale("en", "GB");
        final NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        System.out.println(format.format(10000));
    }
}
