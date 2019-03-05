package by.itacademy.java.yaskelevich.classroom.lessons11.collections;

import java.util.ArrayList;
import java.util.List;

public class SampleArrList {
    public static void main(final String[] args) {
        final List<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        System.out.println("first word is:" + words.get(0));
        words.remove(0);
        System.out.println("first word after remove is:" + words.get(0));
    }
}
