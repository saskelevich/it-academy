package by.itacademy.java.yaskelevich.classroom.lessons10.anno.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface Version {
    String versionNumber();
    // String value = new String();

}
