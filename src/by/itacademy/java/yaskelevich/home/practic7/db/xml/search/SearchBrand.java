package by.itacademy.java.yaskelevich.home.practic7.db.xml.search;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.BrandXmlDaoImpl;

public final class SearchBrand implements ISearch<Brand, String> {
    private final IDao<Brand> dao;
    private static ISearch<Brand, String> instance;

    {
        dao = BrandXmlDaoImpl.getInstance();
    }

    private SearchBrand() {
    }

    public static ISearch<Brand, String> getInstance() {
        if (instance == null) {
            instance = new SearchBrand();
        }
        return instance;
    }

    @Override
    public List<Brand> search(final String entity) throws FileNotFoundException {
        final List<Brand> brands = new ArrayList<Brand>();
        dao.getAll().stream().filter(brand -> brand.getName().equalsIgnoreCase(entity))
                .forEach(str -> brands.add(str));
        if (brands.size() == 0) {
            throw new FileNotFoundException("Brand name is not valid");
        }
        return brands;
    }

}
