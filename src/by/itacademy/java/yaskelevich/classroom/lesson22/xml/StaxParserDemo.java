package by.itacademy.java.yaskelevich.classroom.lesson22.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.Food;
import by.itacademy.java.yaskelevich.classroom.lesson22.xml.model.ParsingResult;

public class StaxParserDemo {
    public static void main(final String[] args) throws FileNotFoundException, IOException {
        boolean bName = false;
        boolean bPrice = false;

        int itemsQuantity = 0;
        final Food hPriceItem = new Food();
        final Food lPriceItem = new Food();
        BigDecimal totalPrice = new BigDecimal(0);

        try (FileInputStream stream = new FileInputStream("sample.xml");) {
            final XMLInputFactory factory = XMLInputFactory.newInstance();

            final XMLEventReader eventReader = factory.createXMLEventReader(stream);

            String lastFoodName = null;
            while (eventReader.hasNext()) {
                final XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()) {

                case XMLStreamConstants.START_ELEMENT:
                    final StartElement startElement = event.asStartElement();
                    final String qName = startElement.getName().getLocalPart();

                    if (qName.equalsIgnoreCase("food")) {
                        itemsQuantity++;
                    } else if (qName.equalsIgnoreCase("name")) {
                        bName = true;
                    } else if (qName.equalsIgnoreCase("price")) {
                        bPrice = true;
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:
                    final Characters characters = event.asCharacters();
                    if (bName) {
                        lastFoodName = characters.getData();
                        bName = false;
                    }
                    if (bPrice) {
                        final String value = characters.getData().replace("$", "");
                        final double price = Double.parseDouble(value);
                        totalPrice = totalPrice.add(BigDecimal.valueOf(price));
                        bPrice = false;

                        if (hPriceItem.getPrice() == null || hPriceItem.getPrice() < price) {
                            hPriceItem.setPrice(price);
                            hPriceItem.setName(lastFoodName);
                        }

                        if (lPriceItem.getPrice() == null || lPriceItem.getPrice() > price) {
                            lPriceItem.setPrice(price);
                            lPriceItem.setName(lastFoodName);
                        }
                    }
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    final EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equalsIgnoreCase("food")) {
                    }
                    break;
                }
            }
        } catch (final XMLStreamException e) {
            e.printStackTrace();
        }

        final ParsingResult result = new ParsingResult();
        result.setItemsQuantity(itemsQuantity);
        result.setTotalPrice(totalPrice.doubleValue());
        result.setItemHighestPrice(hPriceItem);
        result.setItemLowestPrice(lPriceItem);

        System.out.println(result);
    }
}
/*
 * itemsQuantity=5 itemHighestPrice=Food [name=Berry-Berry Belgian Waffles,
 * price=8.95] itemLowestPrice=Food [name=French Toast, price=4.5]
 * totalPrice=34.3
 * 
 */