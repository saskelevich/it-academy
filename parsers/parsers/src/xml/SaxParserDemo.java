package xml;

import java.io.FileInputStream;
import java.math.BigDecimal;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import xml.model.Food;
import xml.model.ParsingResult;

public class SaxParserDemo extends DefaultHandler {
	private static ParsingResult result;

	private int itemsQuantity;

	private Food hPriceItem = new Food();
	private Food lPriceItem = new Food();

	private String lastTagName;

	private String lastFoodName;

	private BigDecimal totalPrice = new BigDecimal(0);

	public static void main(String args[]) throws Exception {
		XMLReader xr = XMLReaderFactory.createXMLReader();
		SaxParserDemo handler = new SaxParserDemo();
		xr.setContentHandler(handler);
		xr.setErrorHandler(handler);

		try (FileInputStream byteStream = new FileInputStream("sample.xml")) {
			xr.parse(new InputSource(byteStream));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
	}

	@Override
	public void startElement(String uri, String name, String qName, Attributes atts) {
		lastTagName = name;
		if ("food".equals(name)) {
			itemsQuantity++;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		str = str.replaceAll("\n", "").replaceAll("\t", "").trim(); // clean formatting characters and whitespaces
		if (str.isEmpty()) {
			return;
		}

		if ("name".equals(lastTagName)) {
			lastFoodName = str;
		}

		if ("price".equals(lastTagName)) {
			String value = str.replace("$", "");
			double price = Double.parseDouble(value);

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
	public void endElement(String uri, String name, String qName) {
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