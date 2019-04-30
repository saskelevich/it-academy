package by.itacademy.java.yaskelevich.home.practic7.db.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Model;
import by.itacademy.java.yaskelevich.home.practic7.db.xml.table.ModelTable;

public final class ModelXmlDaoImpl extends AbstractXMLDao<ModelTable> implements IDao<Model> {

    private static final String MODEL_TABLE_FILE = "models-table.xml";
    private static IDao<Model> instance;

    private ModelXmlDaoImpl() {
    }

    public static IDao<Model> getInstance() {
        if (instance == null) {
            instance = new ModelXmlDaoImpl();
        }
        return instance;
    }

    @Override
    public Model insert(final Model entity) {
        final ModelTable modelTable = read();
        final Integer id = modelTable.nextId();
        entity.setId(id);
        final Date created = new Date();
        entity.setCreated(created);
        entity.setUpdated(created);
        modelTable.getModels().add(entity);
        write(modelTable);
        return entity;
    }

    @Override
    public void update(final Model entity) {
        final ModelTable table = read();
        table.getModels().stream().forEach(str -> {
            if (str.equals(entity)) {
                str.setName(entity.getName());
                str.setBrandId(entity.getBrandId());
                str.setUpdated(new Date());
            }
        });
        write(table);
    }

    @Override
    public void delete(final Integer id) {
        final ModelTable modelTable = read();
        final Iterator<Model> iterator = modelTable.getModels().iterator();
        while (iterator.hasNext()) {
            final Model model = iterator.next();
            if (model.getId().equals(id)) {
                iterator.remove();
            }
        }
        write(modelTable);
    }

    @Override
    public List<Model> getAll() {
        final ModelTable modelTable = read();
        return modelTable.getModels();
    }

    @Override
    protected String getFileName() {
        return MODEL_TABLE_FILE;
    }

    @Override
    protected Class<ModelTable> getTableClass() {
        return ModelTable.class;
    }

}
