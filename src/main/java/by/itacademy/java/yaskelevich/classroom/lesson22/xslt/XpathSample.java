package by.itacademy.java.yaskelevich.classroom.lesson22.xslt;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XpathSample {
    public static void main(final String[] args)
            throws ParserConfigurationException, XPathExpressionException, SAXException, IOException {
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        final Document xmlDocument = builder.parse(XpathSample.class.getResourceAsStream("xml-source.xml"));
        final XPath xPath = XPathFactory.newInstance().newXPath();
        final String expression = "/hello-world/greeting";
        System.out.println(xPath.compile(expression).evaluate(xmlDocument, XPathConstants.STRING));
    }
}
