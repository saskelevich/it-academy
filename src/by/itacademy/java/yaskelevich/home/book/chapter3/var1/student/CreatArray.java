package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student;

import java.util.Random;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype.Adress;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype.Date;

/**
 * Создать массив объектов. Вывести: a) список студентов заданного факультета; b) списки студентов
 * для каждого факультета и курса; c) список студентов, родившихся после заданного года; d) список
 * учебной группы.
 */
public class CreatArray {
    private static final int MIN_YEAR = 1990;
    private static final int MAX_PHONE_NUMBER = 899999;
    private static final int MIN_PHONE_NUMBER = 100000;
    private static final Random RAND = new Random();
//    private static final Scanner IN = new Scanner(System.in);
    public static final String[] FACULTY = {"Math", "Language", "History"};
    public static final String[] FIRST_NAME = {"Smit", "Lee", "Anderson", "Gray", "Lincoln",
            "Jeferson", "Ford", "Diesel", "Jonson", "Austin"};
    public static final String[] NAME = {"Jon", "Robert", "Jack", "Alex", "Mary", "Kate", "Eliza",
            "Bruce", "Margaret", "Melissa"};
    public static final String[] GROUP = {"M0S65", "U1A12", "K2F17", "J5F21", "G5H35", "E8L23"};
    public static final String[] LAND = {"USA", "UK", "Australia", "Canada", "Russia"};
    public static final String[] SITY = {"London", "Manchester", "Toronto", "Sidney", "Moskau",
            "Paris", "Madrid", "New York", "Tokio"};
    public static final String[] STREAT = {"Evergrean", "Third", "First", "Park", "Main", "Cedar",
            "Hill"};

    private static int id = -1;

    public static void creatArray(final Student[] array) {
        for (int i = 0; i < array.length; i++) {
            createStudent(array[i]);
        }
    }

    private static void createStudent(final Student stud) {
        stud.setId(creatId());
        stud.setFirstName(creatFirstName());
        stud.setName(creatName());
        stud.setDate(creatDate());
        stud.setAdress(creatAdress(stud));
        stud.setPhoneNumber(creatPhoneNumber());
        stud.setFaculty(creatFaculty());
        stud.setGrade(creatGrade());
        stud.setGroup(creatGroup());
    }

    private static int creatId() {
        return ++id;
    }

    private static String creatFirstName() {
        return FIRST_NAME[RAND.nextInt(FIRST_NAME.length)];
    }

    private static String creatName() {
        return NAME[RAND.nextInt(NAME.length)];
    }

    private static Date creatDate() {
        final Date date = new Date();
        date.setDay(RAND.nextInt(32));
        date.setMonth(RAND.nextInt(13));
        date.setYear((RAND.nextInt(30) + MIN_YEAR));
        return date;
    }

    private static Adress creatAdress(final Student stud) {
        final Adress adress = new Adress();
        adress.setLand(LAND[RAND.nextInt(LAND.length)]);
        adress.setSity(SITY[RAND.nextInt(SITY.length)]);
        adress.setStreat(STREAT[RAND.nextInt(STREAT.length)]);
        adress.setNumberHome(RAND.nextInt());
        adress.setNumberApartment(RAND.nextInt());
        return adress;
    }

    private static int creatPhoneNumber() {
        return (RAND.nextInt(MAX_PHONE_NUMBER) + MIN_PHONE_NUMBER);
    }

    private static String creatFaculty() {
        return FACULTY[RAND.nextInt(FACULTY.length)];
    }

    private static int creatGrade() {
        return (RAND.nextInt(5) + 1);
    }

    private static String creatGroup() {
        return GROUP[RAND.nextInt(GROUP.length)];
    }

}
