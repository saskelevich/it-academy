package by.itacademy.java.yaskelevich.classroom.lesson22.xml;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.Food;
import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.ParsingResult;

public class DomParserDemo {

    public static void main(final String argv[])
            throws SAXException, IOException, ParserConfigurationException {
        final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        final Document doc = dBuilder.parse(new File("sample.xml"));

        doc.getDocumentElement().normalize();

        final NodeList nList = doc.getElementsByTagName("food");

        final Food hPriceItem = new Food();
        final Food lPriceItem = new Food();
        BigDecimal totalPrice = new BigDecimal(0);

        for (int i = 0; i < nList.getLength(); i++) {
            final Node nNode = nList.item(i);
            final String priceString = getElementValue(nNode, "price");
            final String foodName = getElementValue(nNode, "name");

            final String value = priceString.replace("$", "");
            final double price = Double.parseDouble(value);
            totalPrice = totalPrice.add(BigDecimal.valueOf(price));

            if (hPriceItem.getPrice() == null || hPriceItem.getPrice() < price) {
                hPriceItem.setPrice(price);
                hPriceItem.setName(foodName);
            }

            if (lPriceItem.getPrice() == null || lPriceItem.getPrice() > price) {
                lPriceItem.setPrice(price);
                lPriceItem.setName(foodName);
            }
        }

        final ParsingResult result = new ParsingResult();
        result.setItemsQuantity(nList.getLength());
        result.setTotalPrice(totalPrice.doubleValue());
        result.setItemHighestPrice(hPriceItem);
        result.setItemLowestPrice(lPriceItem);

        System.out.println(result);
    }

    private static String getElementValue(final Node nNode, final String elementName) {
        final NodeList children = nNode.getChildNodes();
        for (int j = 0; j < children.getLength(); j++) {
            final Node childNode = children.item(j);
            if (elementName.equals(childNode.getNodeName())) {
                return childNode.getTextContent();
            }
        }
        return null;
    }
}
/*
 * itemsQuantity=5 itemHighestPrice=Food [name=Berry-Berry Belgian Waffles, price=8.95]
 * itemLowestPrice=Food [name=French Toast, price=4.5] totalPrice=34.3
 */