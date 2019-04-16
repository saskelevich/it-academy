package by.itacademy.java.yaskelevich.classroom.lesson22.xml.model;

public class ParsingResult {
    private int itemsQuantity;
    private Food itemHighestPrice;
    private Food itemLowestPrice;
    private double totalPrice;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public void setItemsQuantity(final int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public Food getItemHighestPrice() {
        return itemHighestPrice;
    }

    public void setItemHighestPrice(final Food itemHighestPrice) {
        this.itemHighestPrice = itemHighestPrice;
    }

    public Food getItemLowestPrice() {
        return itemLowestPrice;
    }

    public void setItemLowestPrice(final Food itemLowestPrice) {
        this.itemLowestPrice = itemLowestPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(final double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "itemsQuantity=" + itemsQuantity + "\nitemHighestPrice=" + itemHighestPrice + "\nitemLowestPrice="
                + itemLowestPrice + "\ntotalPrice=" + totalPrice;
    }

}
