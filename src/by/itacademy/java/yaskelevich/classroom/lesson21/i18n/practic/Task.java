package by.itacademy.java.yaskelevich.classroom.lesson21.i18n.practic;

import java.util.ResourceBundle;

public class Task {
    public static void main(final String[] args) {
        ResourceBundle bundle;
        final String key = "prop.ke1";
        bundle = ResourceBundle.getBundle("resources/prop_en_US.properties");
        System.out.println(bundle.getString(key));
    }
}
