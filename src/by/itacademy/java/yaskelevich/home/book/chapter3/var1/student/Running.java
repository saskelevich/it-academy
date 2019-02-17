package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task.Task1;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task.Task2;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task.Task3;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.task.Task4;

public class Running {

    public static void main(final String[] args) {
        final Student[] stud = new Student[10];
        for (int i = 0; i < stud.length; i++) {
            stud[i] = new Student();
        }
        CreatArray.creatArray(stud);
        Task1.showFaculty(stud);
        Task2.listStud(stud);
        Task3.sortIsYear(1999, stud);
        Task4.ShowStdInGroup(stud);
//        show(stud);
    }

    private static void show(final Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getFirstName());
        }
    }
}
