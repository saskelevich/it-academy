package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class CharsetTest {
    public static void main(final String[] args) {
        final SortedMap<String, Charset> charsetsMap = Charset.availableCharsets();
        System.out.println("Charset available :" + charsetsMap.size());
        for (final String name : charsetsMap.keySet()) {
            final Charset charset = charsetsMap.get(name);
            final StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(name);
            stringBuffer.append(" (");
            ;
            for (final Iterator<String> aliases = charset.aliases().iterator(); aliases.hasNext();) {
                stringBuffer.append(aliases.next());
                if (aliases.hasNext()) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append(")");
            System.out.println(stringBuffer.toString());
        }
    }
}
