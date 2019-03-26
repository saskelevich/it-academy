package by.itacademy.java.yaskelevich.home.practic6.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final String PATTERN = "\\b[^\\w]+\\b";
    private static final String URL = "https://sample-videos.com/text/Sample-text-file-10kb.txt";
    private static final String FILE_PATH = "words/";

    public static void main(final String[] args)
            throws MalformedURLException, ProtocolException, IOException {
        final String[] strins = readFromUrl(URL).split(PATTERN);
        final Set<String> words = new HashSet<String>();

        for (final String string : strins) {
            words.add(string.toLowerCase());
        }

        for (final String word : words) {
            write(word, create(word));
        }
    }

    private static String create(final String str) throws IOException {
        final File dir = new File(FILE_PATH + str.charAt(0));
        final File file = new File(dir.getAbsolutePath() + "/words.txt");

        if (!dir.exists()) {
            dir.mkdir();
            file.createNewFile();
        }

        return file.getAbsolutePath();
    }

    private static void write(final String str, final String path) throws IOException {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)))) {
            out.print(str + "\n");
        }
    }

    private static String readFromUrl(final String url)
            throws MalformedURLException, IOException, ProtocolException {
        final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        String htmlString = null;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            final StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                htmlString = response.toString();
            }
        }
        return htmlString;
    }

}
