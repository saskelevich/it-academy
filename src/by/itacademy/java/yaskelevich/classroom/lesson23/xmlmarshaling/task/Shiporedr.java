package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shiporedr")
public class Shiporedr {
    private String orderPerson;
    private Shipto shipto;
    private List<Item> items;

    @XmlElement(name = "orderperson")
    public String getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(final String orderPerson) {
        this.orderPerson = orderPerson;
    }

    @XmlElement(name = "shipto")
    public Shipto getShipto() {
        return shipto;
    }

    public void setShipto(final Shipto shipto) {
        this.shipto = shipto;
    }

    @XmlElement(name = "item")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(final List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Shiporedr [orderPerson=" + orderPerson + ", shipto=" + shipto + ", items=" + items + "]";
    }

}
