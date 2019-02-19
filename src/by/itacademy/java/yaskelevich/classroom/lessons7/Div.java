package by.itacademy.java.yaskelevich.classroom.lessons7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Div {
    public static void main(final String[] args) throws IOException, ProtocolException, IOException {
        final Pattern p = Pattern.compile("<div[^>]*>");
        // final Pattern p = Pattern.compile("<div.*?>");
        final Matcher matcher = p.matcher(readFromUrl("https://news.tut.by/"));
        // final Matcher matcher = p.matcher(readFromUrl("https://www.google.com/"));
        int sum = 0;
        while (matcher.find()) {
            // System.out.println(matcher.start() + " " + matcher.end());
            ++sum;
        }
        System.out.printf("Summa = %d", sum);
    }

    private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
        final URL obj = new URL(url);
        final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");
        String htmlString = null;
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
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
