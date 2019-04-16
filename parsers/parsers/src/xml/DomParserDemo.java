package xml;

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

import xml.model.Food;
import xml.model.ParsingResult;

public class DomParserDemo {

	public static void main(String argv[]) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new File("sample.xml"));

		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("food");

		Food hPriceItem = new Food();
		Food lPriceItem = new Food();
		BigDecimal totalPrice = new BigDecimal(0);

		for (int i = 0; i < nList.getLength(); i++) {
			Node nNode = nList.item(i);
			String priceString = getElementValue(nNode, "price");
			String foodName = getElementValue(nNode, "name");

			String value = priceString.replace("$", "");
			double price = Double.parseDouble(value);
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

		ParsingResult result = new ParsingResult();
		result.setItemsQuantity(nList.getLength());
		result.setTotalPrice(totalPrice.doubleValue());
		result.setItemHighestPrice(hPriceItem);
		result.setItemLowestPrice(lPriceItem);

		System.out.println(result);
	}

	private static String getElementValue(Node nNode, String elementName) {
		NodeList children = nNode.getChildNodes();
		for (int j = 0; j < children.getLength(); j++) {
			Node childNode = children.item(j);
			if (elementName.equals(childNode.getNodeName())) {
				return childNode.getTextContent();
			}
		}
		return null;
	}
}