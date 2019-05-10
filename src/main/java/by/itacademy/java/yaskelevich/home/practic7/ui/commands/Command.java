package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    String name();

    String description() default "";
}