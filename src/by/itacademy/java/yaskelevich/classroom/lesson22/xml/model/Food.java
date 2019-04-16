package by.itacademy.java.yaskelevich.classroom.lesson22.xml.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Food {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", price=" + price + "]";
    }

}