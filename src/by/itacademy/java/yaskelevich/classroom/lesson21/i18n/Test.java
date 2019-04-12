package by.itacademy.java.yaskelevich.classroom.lesson21.i18n;

import java.util.Locale;

public class Test {
    public static void main(final String[] args) {
        final Locale locale = Locale.getDefault();

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayName());
    }
}
