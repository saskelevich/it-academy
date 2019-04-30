package by.itacademy.java.yaskelevich.home.practic7.db.xml.search;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.ModelXmlDaoImpl;

public final class SearchModel implements ISearch<Model, Brand> {
    private final IDao<Model> dao;
    private static ISearch<Model, Brand> instance;

    {
        dao = ModelXmlDaoImpl.getInstance();
    }

    private SearchModel() {
    }

    public static ISearch<Model, Brand> getInstance() {
        if (instance == null) {
            instance = new SearchModel();
        }
        return instance;
    }

    @Override
    public List<Model> search(final Brand entity) throws FileNotFoundException {
        final List<Model> models = new ArrayList<Model>();
        dao.getAll().stream().filter(model -> model.getBrandId().equals(entity.getId()))
                .forEach(model -> models.add(model));
        if (models.size() == 0) {
            throw new FileNotFoundException("Model name is not valid");
        }
        return models;
    }

}
