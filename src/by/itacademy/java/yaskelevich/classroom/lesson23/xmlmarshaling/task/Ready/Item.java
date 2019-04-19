package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task.Ready;

public class Item {
    private String title;
    private Integer quantity;
    private Double price;

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "title='" + title + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }
}