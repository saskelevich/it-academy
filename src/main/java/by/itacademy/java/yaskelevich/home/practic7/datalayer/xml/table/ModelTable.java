package by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model;

@XmlRootElement
public class ModelTable {
    private Integer nextId = 1;

    private List<Model> models = new ArrayList<>();

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(final Integer nextId) {
        this.nextId = nextId;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(final List<Model> models) {
        this.models = models;
    }

    public Integer nextId() {
        nextId++;
        return nextId;
    }

}
