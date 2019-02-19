package by.itacademy.java.yaskelevich.classroom.lessons7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(final String[] args) {
        final Pattern p = Pattern.compile(" +- +");
        final Matcher matcher = p.matcher("Test - string - test");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }
    }
}
