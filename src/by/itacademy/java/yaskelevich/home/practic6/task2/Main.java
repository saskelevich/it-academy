package by.itacademy.java.yaskelevich.home.practic6.task2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

import by.itacademy.java.yaskelevich.home.practic6.task2.url.ReadURL;

public class Main {

    public static void main(final String[] args) throws MalformedURLException, ProtocolException, IOException {
        final String[] str = ReadURL.readFromUrl(" https://www.sample-videos.com/download-sample-text-file.php")
                .split("\\b[\\^w]+\\b");

    }
}
