package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {

    }

    public Date(final Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public Date(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(final int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(final int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return (this.getDay() + "." + this.getMonth() + "." + this.getYear() + ";");
    }
}
