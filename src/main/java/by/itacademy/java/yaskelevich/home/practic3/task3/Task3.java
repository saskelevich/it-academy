package by.itacademy.java.yaskelevich.home.practic3.task3;

import java.io.IOException;

import by.itacademy.java.yaskelevich.home.practic3.url.ReadURL;

//3. Напечатать без повторения слова текста,
//у которых первая и последняя буквы совпадают.
public class Task3 {
    private final String text;

    public Task3(final String url) throws IOException {
        this.text = ReadURL.readFromUrl(url);
    }

    public void isWord() throws IOException {
        String[] tmp;
        tmp = text.split("\\W+");
        writeEquals(tmp);
    }

    private void writeEquals(final String[] tmp) throws IOException {
        for (int i = 0; i < tmp.length; i++) {
            if (checkLength(tmp, i) && equalsLastAndFirst(tmp, i) && isFirstTime(tmp, i)) {
                System.out.println(tmp[i]);
            }
        }
        System.out.println();
    }

    private boolean checkLength(final String[] tmp, final int index) {
        return (tmp[index].length() > 1);
    }

    private boolean equalsLastAndFirst(final String[] tmp, final int index) {
        return (tmp[index].charAt(0) == tmp[index].charAt(tmp[index].length() - 1));
    }

    private boolean isFirstTime(final String[] tmp, final int index) {
        for (int i = 0; i < index - 1; i++) {
            if (tmp[index].equals(tmp[i])) {
                return false;
            }
        }
        return true;
    }
}
