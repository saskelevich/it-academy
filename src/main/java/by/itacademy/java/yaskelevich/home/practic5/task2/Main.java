package by.itacademy.java.yaskelevich.home.practic5.task2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import by.itacademy.java.yaskelevich.home.practic5.url.ReadURL;

public class Main {
    private static final String URL = "https://sample-videos.com/text/Sample-text-file-10kb.txt";
    private static final String PATTERN = "\\b[^\\w]+\\b";

    public static void main(final String[] args)
            throws MalformedURLException, ProtocolException, IOException {

        final Set<String> words = new HashSet<String>();

        words.addAll(Arrays.asList(ReadURL.readFromUrl(URL).toLowerCase().split(PATTERN)));

        System.out.println(words);
    }

}
