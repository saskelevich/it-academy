package by.itacademy.java.yaskelevich.home.practic7.db.xml.search;

import java.io.FileNotFoundException;
import java.util.List;

public interface ISearch<T, Y> {

    List<T> search(Y entity) throws FileNotFoundException;

}
