package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task;

public class Item {
    private String title;
    private String note;
    private int quantity;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [title=" + title + ", note=" + note + ", quantity=" + quantity + ", price=" + price + "]";
    }

}
