package by.itacademy.java.yaskelevich.home.practic5.task3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

import by.itacademy.java.yaskelevich.home.practic3.url.ReadURL;

public class Main {
    private static final String PATTERN = ("\\b[^\\w]+\\b");
    private static final String URL = "https://sample-videos.com/text/Sample-text-file-10kb.txt";

    public static void main(final String[] args)
            throws MalformedURLException, ProtocolException, IOException {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final String[] word = ReadURL.readFromUrl(URL).split(Main.PATTERN);
        Integer value = 0;
        for (final String string : word) {
            value = map.get(string);
            if (value != null) {
                map.replace(string, value + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
    }
}
