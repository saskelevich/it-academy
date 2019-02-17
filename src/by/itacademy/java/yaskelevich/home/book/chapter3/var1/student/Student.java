package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student;

import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype.Adress;
import by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype.Date;

/**
 * 
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 *
 */
public class Student {

    private int id;
    private String firstName;
    private String name;
    private Date date;
    private Adress adress;
    private int phoneNumber;
    private String faculty;
    private int grade;
    private String group;

    public Student() {
    }

    public Student(final Student stud) {
        this.id = stud.getId();
        this.firstName = stud.getFirstName();
        this.name = stud.getName();
        this.date = new Date(stud.getDate());
        this.adress = stud.getAdress();
        this.phoneNumber = stud.getPhoneNumber();
        this.faculty = stud.getFaculty();
        this.grade = stud.getGrade();
        this.group = stud.getGroup();
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(final String patronymic) {
        this.name = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setDate(final Date date) {
        this.date = new Date(date);
    }

    public Date getDate() {
        return date;
    }

    public void setAdress(final Adress adres) {
        this.adress = adres;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setPhoneNumber(final int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFaculty(final String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student class";
    }
}
