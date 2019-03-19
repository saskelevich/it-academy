package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

public class Slot extends MoneyItem implements Comparable<Slot> {

    public Slot(final int nominal) {
        super(nominal);
    }

    public void addQuantity(final int quantity) {
        setQuantity(getQuantity() + quantity);
    }

    public void removeQuantity(final int quantity) {
        setQuantity(getQuantity() - quantity);
    }

    public boolean isApplicable(final int nominal) {
        return getNominal() == nominal;
    }

    @Override
    public int compareTo(final Slot o) {
        return getNominal() - o.getNominal();
    }
}
