package by.itacademy.java.yaskelevich.classroom.lessons10.anno.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public static void main(final String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        runAutoexecutable(new Sample1());
        runAutoexecutable(new Sample2());
        runAutoexecutable(new Sample3());
        runAutoexecutable(new Object());
        runAutoexecutable(new String());
    }

    private static void runAutoexecutable(final Object o)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final Class<? extends Object> clazz = o.getClass();
        System.out.printf("processing object of class %s\n", clazz);

        final Method[] methods = clazz.getDeclaredMethods();

        for (final Method method : methods) {
            final Autoexeccutable annotation = method.getAnnotation(Autoexeccutable.class);
            if (annotation != null) {
                method.invoke(o);
            }
        }
        System.out.println("---------------------");
    }
}