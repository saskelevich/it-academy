package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

public class MoneyItem {

    private int quantity;
    private int nominal;

    public MoneyItem(final int nominal) {
        this(0, nominal);
    }

    public MoneyItem(final int quantity, final int nominal) {
        super();
        this.quantity = quantity;
        this.nominal = nominal;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public void setNominal(final int nominal) {
        this.nominal = nominal;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "MoneyItem [quantity=" + quantity + ", nominal=" + nominal + "]";
    }

}