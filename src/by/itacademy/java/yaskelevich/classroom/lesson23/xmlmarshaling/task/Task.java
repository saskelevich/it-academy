package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task.Ready.ShipOrder;

public class Task {
    public static void main(final String[] args) throws JAXBException {
        final File file = new File("task.xml");
        final JAXBContext jaxbContext = JAXBContext.newInstance(ShipOrder.class);
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        final ShipOrder shiporedr = (ShipOrder) unmarshaller.unmarshal(file);
        System.out.println(shiporedr);
    }
}
