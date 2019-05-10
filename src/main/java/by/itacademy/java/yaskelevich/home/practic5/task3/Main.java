package by.itacademy.java.yaskelevich.home.practic5.task3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

import by.itacademy.java.yaskelevich.home.practic5.url.ReadURL;

public class Main {
    private static final String PATTERN = ("\\b[^\\w]+\\b");
    private static final String URL = "https://sample-videos.com/text/Sample-text-file-10kb.txt";

    public static void main(final String[] args)
            throws MalformedURLException, ProtocolException, IOException {

        final Map<String, Integer> words = new HashMap<String, Integer>();
        final String[] tmp = ReadURL.readFromUrl(URL).split(Main.PATTERN);

        for (final String string : tmp) {
            if (words.containsKey(string)) {
                words.replace(string, words.get(string) + 1);
            } else {
                words.put(string, 1);
            }
        }

        System.out.println(words);
    }
}
