package by.itacademy.java.yaskelevich.classroom.lessons7;

import java.util.Scanner;

public class Task0 {
    // public static void main(final String[] args) {
    // final String str = "asd";
    // if (str.matches("[a-zA-Z]+")) {
    // System.out.println("Only letter");
    // }
    // if (str.matches("//d+")) {
    // System.out.println("Only numbers");
    // } else {
    // System.out.println("number and letter");
    // }
    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final String line = sc.nextLine();
            String result = "String contains various characters";
            final String numRegex = "\\d+";
            final String wordRegex = "(?i)[a-z]+";
            if (line.matches(numRegex)) {
                result = "String contains only numbers";
            } else if (line.matches(wordRegex)) {
                result = "String contains only letters";
            }
            System.out.println(result);
        }
    }
}
