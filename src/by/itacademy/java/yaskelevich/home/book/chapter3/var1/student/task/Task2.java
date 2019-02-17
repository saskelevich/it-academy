package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.CreatArray;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.Student;

//b) списки студентов для каждого факультета и курса;
public class Task2 {

    public static void listStud(final Student[] array) {

        for (int i = 0; i < CreatArray.FACULTY.length; i++) {
            printStud(array, CreatArray.FACULTY[i]);
        }
    }

    private static void printStud(final Student[] array, final String faculty) {
        System.out.printf("\nFaculty %s:", faculty);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nGrade %d: ", i);
            for (int j = 0; j < array.length; j++) {
                if ((faculty.equals(array[j].getFaculty())) && (array[j].getGrade() == i)) {
                    System.out.printf("%s %s, ", array[j].getName(), array[j].getFirstName());

                }
            }
        }
    }

}
