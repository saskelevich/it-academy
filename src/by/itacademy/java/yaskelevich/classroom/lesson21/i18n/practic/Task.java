package by.itacademy.java.yaskelevich.classroom.lesson21.i18n.practic;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task {
    public static void main(final String[] args) {
        final String key = "key1";
        final Locale local = new Locale("ru", "RU");
        final ResourceBundle bundle = ResourceBundle.getBundle("prop", local);
        System.out.println(bundle.getString(key));

    }
}
