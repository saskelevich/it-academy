package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

import java.util.ArrayList;
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

    public void withdraw(final int fullSum) {
        System.out.println("requested sum:" + fullSum);

        final List<Slot> slots = getSlots();
        int remainingSum = fullSum;

        final List<MoneyItem> results = new ArrayList<>();
        for (final Slot slot : slots) {
            final int nominal = slot.getNominal();
            final int quantity = Math.min(remainingSum / nominal, slot.getQuantity());

            if (quantity > 0) {
                remainingSum -= nominal * quantity;
                results.add(new MoneyItem(quantity, nominal));
            }
            if (remainingSum == 0) {
                break;
            }
        }

        if (remainingSum > 0) {
            System.out.printf("can\'t handle sum %s. Try again... \n", fullSum);
        } else {
            withdrawInternal(results);
        }
        printAtmStatus();
    }

    private void withdrawInternal(final List<MoneyItem> results) {
        System.out.println("withdraw result:");
        for (final MoneyItem result : results) {
            removeMoney(result);
            System.out.println(result);
        }
    }

    private void removeMoney(final MoneyItem result) {
        final List<Slot> slots = getSlots();
        for (final Slot slot : slots) {
            if (slot.isApplicable(result.getNominal())) {
                slot.removeQuantity(result.getQuantity());
                return;
            }
        }

    }

    public void addMoney(final int nominal, final int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity should be positive intead of " + quantity);
        }

        final List<Slot> slots = getSlots();
        for (final Slot slot : slots) {
            if (slot.isApplicable(nominal)) {
                slot.addQuantity(quantity);
                printAtmStatus();
                return;
            }
        }

        throw new IllegalArgumentException("can\'t find slot for nominal" + nominal);
    }

    public void printAtmStatus() {
        final List<Slot> slots = getSlots();
        System.out.println("\nATM status:");
        for (final Slot slot : slots) {
            System.out.println(slot);
        }
        System.out.println();
    }
}