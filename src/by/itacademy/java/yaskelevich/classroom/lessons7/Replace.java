package by.itacademy.java.yaskelevich.classroom.lessons7;

public class Replace {
    public static void main(final String[] args) {
        final String str = "Test     multiple     spaces";
        System.out.println(str.replaceAll(" +", " "));
    }
}
