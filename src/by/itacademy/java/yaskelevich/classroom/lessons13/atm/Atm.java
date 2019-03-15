package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

import java.util.Collections;
import java.util.List;

public class Atm {
    private final List<Slot> slots;

    public Atm(final List<Slot> slots) {
        super();
        Collections.sort(slots);
        Collections.reverse(slots);
        this.slots = slots;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void withdraw(final int sum) {
        final List<Slot> slots = getSlots();
        for (final Slot slot : slots) {

        }
    }

    public void addMoney(final int nominal, final int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity should be positive intead of" + quantity);
        }
        final List<Slot> slots = getSlots();
        for (final Slot slot : slots) {
            if (slot.isApplicable(nominal)) {
                slot.addQuantity(quantity);
                return;
            }
        }
        throw new IllegalArgumentException("can\'t find slot for nominal" + nominal);
    }

    public void printAtmStatus() {
        final List<Slot> slots = getSlots();
        System.out.println("ATM status start");
        for (final Slot slot : slots) {
            System.out.println(slot);
        }
        System.out.println();
    }

}
