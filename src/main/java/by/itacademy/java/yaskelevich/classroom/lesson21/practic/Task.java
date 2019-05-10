package by.itacademy.java.yaskelevich.classroom.lesson21.practic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task {

    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final File dir = new File("./resources");
        final String[] propertyFileNames = dir.list((final File d, final String name) -> {
            return name.endsWith(".properties");
        });

        final StringBuilder sb = new StringBuilder();
        for (final String name : propertyFileNames) {
            final String subStr = name.substring(name.indexOf("_") + 1, name.indexOf("."));
            sb.append(subStr).append(", ");
        }

        System.out.println("Hello! I know salaries for "
                + sb.toString().substring(0, sb.toString().length() - 2)
                + ". What is your locale?");

        String str;
        while (!(str = br.readLine()).equals("")) {
            final String[] array = str.split("_");
            final Locale locale = new Locale(array[0], array[1]);
            final ResourceBundle rb = ResourceBundle.getBundle("prop", locale);
//            final ResourceBundle rb = ResourceBundle.getBundle("prop", locale, new UTF8Control());
            System.out.println(rb.getString("prop.key1"));
        }
    }
}