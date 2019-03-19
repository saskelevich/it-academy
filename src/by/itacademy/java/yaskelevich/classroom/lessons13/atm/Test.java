package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(final String[] args) {
        final List<Slot> slots = new ArrayList<Slot>(); // TODO LinkedList
        slots.add(new Slot(10));
        slots.add(new Slot(50));
        slots.add(new Slot(20));

        final Atm atm = new Atm(slots);

        atm.addMoney(20, 100);
        atm.addMoney(50, 100);
        atm.addMoney(10, 100);

        atm.withdraw(150);

        atm.withdraw(155);
        atm.withdraw(170);
    }
}