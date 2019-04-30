package by.itacademy.java.yaskelevich.home.practic7.db.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.table.BrandTable;

public final class BrandXmlDaoImpl extends AbstractXMLDao<BrandTable> implements IDao<Brand> {

    private static final String BRANDS_TABLE_FILE = "brands-table.xml";
    private static IDao<Brand> instance;

    private BrandXmlDaoImpl() {
    }

    public static IDao<Brand> getInstance() {
        if (instance == null) {
            instance = new BrandXmlDaoImpl();
        }
        return instance;
    }

    @Override
    public Brand insert(final Brand entity) {
        final BrandTable table = read();
        final Integer id = table.nextId();
        entity.setId(id);
        final Date created = new Date();
        entity.setCreated(created);
        entity.setUpdated(created);
        table.getBrands().add(entity);
        write(table);
        return entity;
    }

    @Override
    public void update(final Brand entity) {
        final BrandTable table = read();
        table.getBrands().stream().forEach(str -> {
            if (str.equals(entity)) {
                str.setName(entity.getName());
                str.setUpdated(new Date());
            }
        });
        write(table);
    }

    @Override
    public void delete(final Integer id) {
        final BrandTable table = read();
        final Iterator<Brand> iterator = table.getBrands().iterator();
        while (iterator.hasNext()) {
            final Brand brand = iterator.next();
            if (brand.getId().equals(id)) {
                iterator.remove();
            }
        }
        write(table);
    }

    @Override
    public List<Brand> getAll() {
        final BrandTable table = read();
        return table.getBrands();
    }

    @Override
    protected String getFileName() {
        return BRANDS_TABLE_FILE;
    }

    @Override
    protected Class<BrandTable> getTableClass() {
        return BrandTable.class;
    }

}
