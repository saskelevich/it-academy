package by.itacademy.java.yaskelevich.classroom.lessons6.part2;

public class StringPool {
    public static void main(final String[] args) {
        final String s1 = "Cat";
        final String s2 = "Cat";
        final String s3 = new String("Cat");
        final String s4 = s3.intern();
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3" + (s1 == s3));
        System.out.println("s1 == s4" + (s1 == s4));
        final Integer i = new Integer("3");
        final Integer ii = new Integer('3');
        final Integer iii = new Integer(3);
    }
}