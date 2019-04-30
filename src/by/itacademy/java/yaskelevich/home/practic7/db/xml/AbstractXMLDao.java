package by.itacademy.java.yaskelevich.home.practic7.db.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public abstract class AbstractXMLDao<T> {
    private static final String ROOT_FOLDER = "./xmldb";

    abstract protected String getFileName();

    abstract protected Class<T> getTableClass();

    static {
        final File root = new File(ROOT_FOLDER);
        if (!root.exists()) {
            root.mkdirs();
        }
    }

    protected AbstractXMLDao() {
        super();
        final File file = getFile();
        if (!file.exists()) {
            try {
                file.createNewFile();
                write(getTableClass().newInstance());
            } catch (InstantiationException | IllegalAccessException | IOException e) {
                e.printStackTrace();
                throw new RuntimeException();// TODO
            }
        }
    }

    protected File getFile() {
        return new File(ROOT_FOLDER + "/" + getFileName());
    }

    protected T read() {
        final File file = getFile();
        JAXBContext jaxbContext;
        Unmarshaller jaxbUnmarshaller;
        try {
            jaxbContext = JAXBContext.newInstance(getTableClass());
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (T) jaxbUnmarshaller.unmarshal(file);
        } catch (final JAXBException e) {
            e.printStackTrace();
            throw new RuntimeException(e);// TODO
        }
    }

    protected void write(final T table) {
        JAXBContext jaxbContext;
        try (FileOutputStream os = new FileOutputStream(getFile());) {
            jaxbContext = JAXBContext.newInstance(getTableClass());
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(table, os);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);// TODO
        }
    }
}
