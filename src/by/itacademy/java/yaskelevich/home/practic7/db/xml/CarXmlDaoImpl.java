package by.itacademy.java.yaskelevich.home.practic7.db.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Car;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.table.CarTable;

public final class CarXmlDaoImpl extends AbstractXMLDao<CarTable> implements IDao<Car> {

    private static final String CARS_TABLE_FILE = "cars-table.xml";
    private static IDao<Car> instance;

    private CarXmlDaoImpl() {
    }

    public static IDao<Car> getInstance() {
        if (instance == null) {
            instance = new CarXmlDaoImpl();
        }
        return instance;
    }

    @Override
    public Car insert(final Car entity) {
        final CarTable carTable = read();
        final Integer id = carTable.nextId();
        entity.setId(id);
        final Date created = new Date();
        entity.setCreated(created);
        entity.setUpdated(created);
        carTable.getCars().add(entity);
        write(carTable);
        return entity;
    }

    @Override
    public void update(final Car entity) {
        final CarTable table = read();
        table.getCars().stream().forEach(str -> {
            if (str.equals(entity)) {
                str.setVin(entity.getVin());
                str.setModelId(entity.getModelId());
                str.setUpdated(new Date());
            }
        });
        write(table);
    }

    @Override
    public void delete(final Integer id) {
        final CarTable carTable = read();
        final Iterator<Car> iterator = carTable.getCars().iterator();
        while (iterator.hasNext()) {
            final Car car = iterator.next();
            if (car.getId().equals(id)) {
                iterator.remove();
            }
        }
        write(carTable);
    }

    @Override
    public List<Car> getAll() {
        final CarTable carTable = read();
        return carTable.getCars();
    }

    @Override
    protected String getFileName() {
        return CARS_TABLE_FILE;
    }

    @Override
    protected Class<CarTable> getTableClass() {
        return CarTable.class;
    }

}
