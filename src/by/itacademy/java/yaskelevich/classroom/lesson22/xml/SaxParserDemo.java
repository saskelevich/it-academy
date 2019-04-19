package by.itacademy.java.yaskelevich.classroom.lesson22.xml;

import java.io.FileInputStream;
import java.math.BigDecimal;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.Food;
import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.ParsingResult;

public class SaxParserDemo extends DefaultHandler {
    private static ParsingResult result;

    private int itemsQuantity;

    private final Food hPriceItem = new Food();
    private final Food lPriceItem = new Food();

    private String lastTagName;

    private String lastFoodName;

    private BigDecimal totalPrice = new BigDecimal(0);

    public static void main(final String args[]) throws Exception {
        final XMLReader xr = XMLReaderFactory.createXMLReader();
        final SaxParserDemo handler = new SaxParserDemo();
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);

        try (FileInputStream byteStream = new FileInputStream("sample.xml")) {
            xr.parse(new InputSource(byteStream));
        } catch (final Exception e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }

    @Override
    public void startElement(final String uri, final String name, final String qName,
            final Attributes atts) {
        lastTagName = name;
        if ("food".equals(name)) {
            itemsQuantity++;
        }
    }

    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
        String str = new String(ch, start, length);
        str = str.replaceAll("\n", "").replaceAll("\t", "").trim(); // clean formatting characters
                                                                    // and whitespaces
        if (str.isEmpty()) {
            return;
        }

        if ("name".equals(lastTagName)) {
            lastFoodName = str;
        }

        if ("price".equals(lastTagName)) {
            final String value = str.replace("$", "");
            final double price = Double.parseDouble(value);

            totalPrice = totalPrice.add(BigDecimal.valueOf(price));

            if (hPriceItem.getPrice() == null || hPriceItem.getPrice() < price) {
                hPriceItem.setPrice(price);
                hPriceItem.setName(lastFoodName);
            }

            if (lPriceItem.getPrice() == null || lPriceItem.getPrice() > price) {
                lPriceItem.setPrice(price);
                lPriceItem.setName(lastFoodName);
            }
        }
    }

    @Override
    public void endElement(final String uri, final String name, final String qName) {
    }

    @Override
    public void startDocument() {
        result = new ParsingResult();
    }

    @Override
    public void endDocument() {
        result.setItemsQuantity(itemsQuantity);
        result.setTotalPrice(totalPrice.doubleValue());
        result.setItemHighestPrice(hPriceItem);
        result.setItemLowestPrice(lPriceItem);
    }
}
/*
 * itemsQuantity=5 itemHighestPrice=Food [name=Berry-Berry Belgian Waffles, price=8.95]
 * itemLowestPrice=Food [name=French Toast, price=4.5] totalPrice=34.3
 */