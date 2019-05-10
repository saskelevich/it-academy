package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task.Ready;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shiporder")
public class ShipOrder {
    private String orderId;
    private String orderPerson;
    private List<Item> items;
    private Ship_To shipTo;

    public ShipOrder() {
    }

    @XmlElement(name = "shipto")
    public Ship_To getShipTo() {
        return shipTo;
    }

    public void setShipTo(final Ship_To shipTo) {
        this.shipTo = shipTo;
    }

    @XmlAttribute(name = "orderid")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }

    @XmlElement(name = "orderperson")
    public String getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(final String orderPerson) {
        this.orderPerson = orderPerson;
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
        final StringBuilder stringBuilder = new StringBuilder(
                String.format("Shiporder %s ordered by %s%n%s", orderId, orderPerson, shipTo));
        final String itemsList = items.stream().map(item -> item.toString())
                .collect(Collectors.joining("\n", "\n", ""));
        stringBuilder.append(itemsList);
        return stringBuilder.toString();

    }
}
