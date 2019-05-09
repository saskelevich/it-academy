package by.itacademy.java.yaskelevich.home.practic7.datalayer.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car;

@XmlRootElement
public class CarTable {
    private Integer nextId = 1;

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(final List<Car> cars) {
        this.cars = cars;
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
