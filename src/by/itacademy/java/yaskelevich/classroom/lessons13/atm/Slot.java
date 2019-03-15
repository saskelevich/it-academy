package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

public class Slot implements Comparable<Slot> {
    private final int nominal;
    private int quantity;

    public Slot(final int nominal) {
        super();
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(final int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(final int quantity) {
        this.quantity -= quantity;
    }

    public boolean isApplicable(final int nominal) {
        return this.nominal == nominal;
    }

    @Override
    public int compareTo(final Slot o) {
        return this.nominal - o.getNominal();
    }

    @Override
    public String toString() {
        return "Slot [nominal=" + nominal + ", quantity=" + quantity + "]";
    }
}
