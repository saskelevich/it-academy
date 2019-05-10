package by.itacademy.java.yaskelevich.classroom.lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample {
    public static void main(final String[] args) {
        final Set<String> words = new HashSet<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");

        final Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
