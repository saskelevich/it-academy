package by.itacademy.java.yaskelevich.classroom.lessons7;

public class Split {
    public static void main(final String[] args) {
        final String str = "Test    string for split";
        final String[] words = str.split(" +");
        // final String[] words = str.split(" ");
        for (final String word : words) {
            System.out.println(word + " ");
        }
    }
}
