package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task;

import java.util.Random;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.CreatArray;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.Student;

//a) список студентов заданного факультета;
public class Task1 {
    private static Random rand = new Random();

    public static void showFaculty(final Student[] array) {
        final String faculty = CreatArray.FACULTY[rand.nextInt(CreatArray.FACULTY.length)];
        System.out.printf("\nFaculty %s:\n", faculty);
        for (int i = 0; i < array.length; i++) {
            if (faculty.equals(array[i].getFaculty())) {
                System.out.printf("%s %s\n", array[i].getName(), array[i].getFirstName());
            }
        }
    }
}
