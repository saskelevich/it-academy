package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling;

import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class UnmarshalingSample {
    // public static void main(final String[] args) throws JAXBException {
    // final File file = new File("sample.xml");
    // final JAXBContext jaxbContext = JAXBContext.newInstance(Menu.class);
    // final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    // final Menu menu = (Menu) unmarshaller.unmarshal(file);
    // System.out.println(menu);
    // }

    public static void main(final String[] args) throws JAXBException {
        final Menu menu = new Menu();
        menu.setFoods(Arrays.asList(new Food("пельмени", "5BYN")));
        final JAXBContext jaxbContext = JAXBContext.newInstance(Menu.class);
        final Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(menu, System.out);
    }
}
