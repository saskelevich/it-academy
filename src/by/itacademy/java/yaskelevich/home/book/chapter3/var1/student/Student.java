package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student;

/**
 * 
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 * Создать массив объектов. Вывести: a) список студентов заданного факультета; b) списки студентов
 * для каждого факультета и курса; c) список студентов, родившихся после заданного года; d) список
 * учебной группы.
 *
 */
public class Student {

    private int id;
    private String firstName;
    private String patronymic;
    private String date;
    private String adress;
    private int phoneNumber;
    private String faculty;
    private int grade;
    private int group;

    public Student() {
    }

    public Student(final Student stud) {
        this.id = stud.getId();
        this.firstName = stud.getFirstName();
        this.patronymic = stud.getPatronymic();
        this.date = stud.getDate();
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

    public void setPatronymic(final String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setAdress(final String adres) {
        this.adress = adres;
    }

    public String getAdress() {
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

    public void setGroup(final int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    private void setTun() {

    }

    private void getTun() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
