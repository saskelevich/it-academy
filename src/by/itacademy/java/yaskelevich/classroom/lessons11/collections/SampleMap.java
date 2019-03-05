package by.itacademy.java.yaskelevich.classroom.lessons11.collections;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {
    public static void main(final String[] args) {
        final Map<Integer, String> words = new HashMap<Integer, String>();
        words.put(1, "First");
        words.put(2, "Two");
        words.put(3, "Three");
        System.out.println("Map :" + words);
        System.out.println("Words is " + words.get(3));
    }
}
