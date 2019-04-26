package by.itacademy.java.yaskelevich.classroom.lesson22.xslt.test;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Table {
    public static void main(final String[] args) throws TransformerException {
        final StreamSource source = new StreamSource(Table.class.getResourceAsStream("table.xml"));
        final StreamSource stylesource = new StreamSource(
                Table.class.getResourceAsStream("table1.xsl"));

        final TransformerFactory factory = TransformerFactory.newInstance();
        final Transformer transformer = factory.newTransformer(stylesource);

        // final StreamResult result = new StreamResult(System.out);
        // transformer.transform(source, result);

        final StreamResult result = new StreamResult(new File("./resources/xml/table.html"));
        transformer.transform(source, result);

    }
}
