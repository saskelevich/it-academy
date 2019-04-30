package by.itacademy.java.yaskelevich.home.practic7.db.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;

@XmlRootElement
public class BrandTable {
    private Integer nextId = 1;

    private List<Brand> brands = new ArrayList<>();

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(final List<Brand> brands) {
        this.brands = brands;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(final Integer nextId) {
        this.nextId = nextId;
    }

    public Integer nextId() {
        nextId++;
        return nextId;
    }
}
