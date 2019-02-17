package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task;

import java.util.Random;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.CreatArray;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.Student;

//d) список учебной группы.
public class Task4 {
    private static Random rand = new Random();

    public static void ShowStdInGroup(final Student[] array) {
        final String group = CreatArray.GROUP[rand.nextInt(CreatArray.GROUP.length)];
        System.out.printf("\nIn group %s:\n", group);
        for (int i = 0; i < array.length; i++) {
            if (group.equals(array[i].getGroup())) {
                System.out.printf("%s %s, ", array[i].getName(), array[i].getFirstName());
            }
        }
    }
}
