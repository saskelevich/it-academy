package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.Student;

//c) список студентов, родившихся после заданного года;
public class Task3 {

    public static void sortIsYear(final int year, final Student[] array) {
        System.out.printf("\n\nYounger than %d:\n", year);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDate().getYear() > year) {
                System.out.printf("%s %s(%s)\n", array[i].getName(), array[i].getFirstName(),
                        array[i].getDate().toString());
            }
        }
    }
}
