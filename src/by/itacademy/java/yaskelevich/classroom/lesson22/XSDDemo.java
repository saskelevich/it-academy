package by.itacademy.java.yaskelevich.classroom.lesson22;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XSDDemo {
    public static void main(final String[] args) {
        final Source xmlFile = new StreamSource(new File("shiporder.xml"));
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            final Schema schema = schemaFactory.newSchema(new File("shiporder.xsd"));
            final Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " is valid");

        } catch (final SAXException e) {
            System.out.println(xmlFile.getSystemId() + " is not valid. Reason: " + e);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
