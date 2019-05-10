package by.itacademy.java.yaskelevich.home.practic3.task4;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic3.url.ReadURL;

//4. В тексте найти и напечатать все слова максимальной и все слова минимальной длины.
public class Task4 {

    private final String text;

    public Task4(final String url) throws IOException {
        this.text = ReadURL.readFromUrl(url);
    }

    public void isMaxMin() throws IOException {
        final String[] tmp = text.split("\\W+");
        searchMaxMin(tmp);
    }

    private void searchMaxMin(final String[] tmp) throws IOException {
        int max = tmp[0].length();
        int min = tmp[0].length();
        for (int i = 0; i < tmp.length; i++) {
            max = isMax(tmp, max, i);
            min = isMin(tmp, min, i);
        }
        show(tmp, max, "Max");
        show(tmp, min, "Min");
    }

    private int isMin(final String[] tmp, final int min, final int index) {
        if ((tmp[index].length() < min) && (tmp[index].matches("\\b\\w+\\b"))) {
            return tmp[index].length();
        }
        return min;
    }

    private int isMax(final String[] tmp, final int max, final int index) {
        if ((tmp[index].length() > max) && (tmp[index].matches("\\b\\w+\\b"))) {
            return tmp[index].length();
        }
        return max;
    }

    private void show(final String[] tmp, final int index, final String description) {
        System.out.printf("%s length:\n", description);
        for (final String string : tmp) {
            if ((string.length() == index) && (string.matches("\\b\\w+\\b"))) {
                System.out.println(string);
            }
        }
        System.out.println();
    }

}
