package by.itacademy.java.yaskelevich.classroom.lessons7;

public class Sample {
    public static void main(final String[] args) {
        final String str = "I study Java";
        final StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append(" and english");
        System.out.println(strBuilder.toString());
    }
}
